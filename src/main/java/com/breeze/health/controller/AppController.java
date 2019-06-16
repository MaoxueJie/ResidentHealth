package com.breeze.health.controller;

import java.util.List;

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
import com.breeze.health.service.AppService;
import com.breeze.health.service.DoctorService;
import com.breeze.health.util.DesUtil;
import com.breeze.health.util.RequestUtils;


@Controller
@CrossOrigin(origins="*")
@RequestMapping("/app")
@SuppressWarnings("all")
public class AppController {
	
	@Autowired
	AppService appService;
	
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
		Result<Void> ret = new Result<Void>();
		System.out.println(request.getAttribute("user"));
		return ret; 
	}
	
	@RequestMapping(value="/getUser")
	@ResponseBody
	public Result<DoctorVo> getUser(HttpServletRequest request){
		Result<DoctorVo> ret = new Result<DoctorVo>();
		ret.setSuccess(true);
		ret.setData((DoctorVo)request.getAttribute("user"));
		return ret; 
	}
	
	@RequestMapping(value="/changePwd")
	@ResponseBody
	public Result<Void> changePwd(HttpServletRequest request,String oldPassword,String newPassword){
		Result<Void> ret = doctorService.changePwd(((DoctorVo)request.getAttribute("user")).getId(), oldPassword, newPassword);
		return ret; 
	}
	
	
	
	@RequestMapping(value="/getSicks")
	@ResponseBody
	public Result<List> getSicks(HttpServletRequest request,String mobile,Integer page,Integer size){
		Result<List> ret = appService.getUsersPage(((DoctorVo)request.getAttribute("user")).getId(),mobile, page, size);
		return ret; 
	}
	
}
