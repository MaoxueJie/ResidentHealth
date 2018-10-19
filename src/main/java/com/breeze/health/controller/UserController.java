package com.breeze.health.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserVo;

@Controller
@SuppressWarnings("all")
public class UserController {
	@RequestMapping(value = "/user/login", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> userLogin(HttpServletRequest request, HttpServletResponse response){
		return null;
	}
	
	@RequestMapping(value = "/user/register", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> userRegister(HttpServletRequest request, HttpServletResponse response){
		return null;
	}
}
