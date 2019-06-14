package com.breeze.health.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserLivingVo;
import com.breeze.health.beans.vo.UserVo;

@Controller
@SuppressWarnings("all")
@RequestMapping("/app")
@CrossOrigin(origins="*")
public class AppController {
	
	@RequestMapping(value="/login")
	@ResponseBody
	public Result<String> login(HttpServletRequest request,UserLivingVo vo){
		
		return null;
	}
	
}
