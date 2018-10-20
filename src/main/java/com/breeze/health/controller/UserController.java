package com.breeze.health.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.service.UserService;
import com.breeze.health.util.DesUtil;
import com.breeze.health.util.RequestUtils;

@Controller
@SuppressWarnings("all")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserVo> userLogin(HttpServletRequest request,  HttpServletResponse response,String mobile,String verificationCode){
		Result<UserVo> ret = userService.loginOrRegister(mobile, verificationCode);
		if (ret.isSuccess())
		{
			String token = DesUtil.encrypt(ret.getData().getId()+"");
			RequestUtils.setCookie(request, response, "Authentication",token, 1800);
			ret.getData().setToken(token);
			request.getSession().setAttribute("user", ret.getData());
		}
		return ret; 
	}
	
	@RequestMapping(value = "/send", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> sendCode(HttpServletRequest request, String mobile){
		
		return userService.sendVertificationCode(mobile);
	}
	
}