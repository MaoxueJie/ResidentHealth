package com.breeze.health.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.service.UserService;
import com.breeze.health.service.impl.LivingServiceImpl;
import com.breeze.health.util.DesUtil;
import com.breeze.health.util.RequestUtils;

public class AuthenticationFilter implements Filter{
	
	private Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class);

	private UserService userService;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		String token = RequestUtils.getCookieValue(httpRequest, "Authentication");
		if (StringUtils.isNotBlank(token))
		{
			RequestUtils.setCookie(httpRequest, httpResponse, "Authentication",token, 1800);
		}else
		{
			token = request.getParameter("token");
			if (StringUtils.isNotBlank(token)) {
				RequestUtils.setCookie(httpRequest, httpResponse, "Authentication",token, 1800);
			}
		}
		try{
			if (httpRequest.getSession().getAttribute("user")==null)
			{
				String userId = DesUtil.decryptor(token);
				Result<UserVo> ret = userService.getUserById(Long.parseLong(userId));
				if (ret.isSuccess())
				{
					httpRequest.getSession().setAttribute("user",ret.getData());
				}
			}
		}catch(Exception e)
		{
			logger.error("认证验证异常", e);
		}
		if (httpRequest.getSession().getAttribute("user")!=null)
		{
			chain.doFilter(request, response);
		}else
		{
			Result<Void> ret = new Result<Void>();
			ret.setCode(-2);
			ret.setMessage("用户未登录");
			responseSendMsg(httpResponse,JSON.toJSONString(ret));
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	protected void responseSendMsg(HttpServletResponse response, String strMsg,
            String... contentType) throws IOException {
		try {
			if (null != contentType && contentType.length > 0) {
				response.setContentType(contentType[0] + "; charset=utf-8");
			} else {
				response.setContentType("application/json; charset=utf-8");
			}
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(strMsg);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			logger.error("responseSendMsg出现异常,异常信息:" + e.toString());
		}
	}
}
