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
import org.springframework.beans.factory.annotation.Autowired;

import com.breeze.health.beans.vo.DoctorVo;
import com.breeze.health.beans.vo.Result;
import com.breeze.health.service.DoctorService;
import com.breeze.health.util.DesUtil;

public class AppAuthenticationFilter implements Filter{

	@Autowired
	DoctorService doctorService;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		boolean loginFlag = false;
		String token = httpRequest.getHeader("Authorization");
		System.out.println("token-----------------------------------"+token);
		if (StringUtils.isNotBlank(token)) {
			try {
				String dockerId = DesUtil.decryptor(token);
				Result<DoctorVo> ret = doctorService.getById(Integer.parseInt(dockerId));
				if (ret.isSuccess() && ret.getData()!=null)
				{
					httpRequest.setAttribute("user",ret.getData());
					loginFlag = true;
				}
				
			}catch(Exception e) {
				
			}
		}
		if (loginFlag)
			chain.doFilter(httpRequest, httpResponse);
		else {
			httpResponse.addHeader("Access-Control-Allow-Credentials", Boolean.TRUE.toString());
			httpResponse.addHeader("Access-Control-Allow-Origin","*");
			if (httpRequest.getMethod().equalsIgnoreCase("OPTIONS"))
				httpResponse.sendError(httpResponse.SC_OK);
			else
				httpResponse.sendError(httpResponse.SC_UNAUTHORIZED);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
