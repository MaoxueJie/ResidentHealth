package com.breeze.health.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.breeze.health.config.WexinConfig;
import com.breeze.health.mapper.UserMapper;

@Controller
@SuppressWarnings("all")
public class HealthController {
	private static Logger logger = LoggerFactory.getLogger(HealthController.class);
	//基本信息
	@RequestMapping(value = "/base", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView userInfo(HttpServletRequest request, HttpServletResponse response){
		ModelAndView view = new ModelAndView();
		
		logger.info("openId="+request.getSession().getAttribute("openid"));
		
		view.setViewName("user");
		return view;
	}
	//查看报告
	@RequestMapping(value = "/report", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView report(){
		return null;
	}
	
	//生活习惯
	@RequestMapping(value = "/living", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView living(){
		return null;
	}
	//健康状况
	@RequestMapping(value = "/sick", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView sick(){
		return null;
	}
	//生理指标
	@RequestMapping(value = "/phy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView physiological(){
		return null;
	}
	//情绪认知（心理健康）
	@RequestMapping(value = "/psy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView psychological(){
		return null;
	}
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	TransactionTemplate transactionTemplate;


	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test(){
		logger.info("_________________________________________________________" + WexinConfig.getAppid());
		logger.info("userMapper = "+userMapper);
		logger.info("transactionManager = " + transactionTemplate.getTransactionManager());
		return "hello world";
	}
}
