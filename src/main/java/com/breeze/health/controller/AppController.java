package com.breeze.health.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breeze.health.beans.vo.DoctorVo;
import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserLivingVo;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.service.DoctorService;
import com.breeze.health.util.DesUtil;
import com.breeze.health.util.RequestUtils;


@Controller
@CrossOrigin(origins="*")
@RequestMapping("/app")
@SuppressWarnings("all")
public class AppController {
	
	@Autowired
	DoctorService doctorService;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public Result<DoctorVo> login(HttpServletRequest request, String mobile,String password){
		Result<DoctorVo> ret = doctorService.login(mobile, password);
		if (ret.isSuccess())
		{
			String token = DesUtil.encrypt(ret.getData().getId()+"");
			ret.getData().setToken(token);
		}
		return ret; 
	}
	
	@RequestMapping(value="/test")
	@ResponseBody
	public Result<Void> test(HttpServletRequest request){
		System.out.println(request.getAttribute("user"));
		return null; 
	}
	
}
