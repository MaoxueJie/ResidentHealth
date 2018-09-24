package com.breeze.health.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.entity.UserLivingHabit;
import com.breeze.health.entity.UserLivingMeal;
import com.breeze.health.entity.UserLivingMovement;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.service.LivingService;
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
	@Resource
	private LivingService livingService;
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
		return new ModelAndView("living");
	}

	//保存生活习惯--嗜好
	@RequestMapping(value="/living/addHabit")
	@ResponseBody
	public Result<String> saveHabit(UserLivingHabit habit){
		Result<String> result = null;
		try{
			result = livingService.addLivingHabit(habit);
		}catch (Exception e){
			logger.error("保存生活习惯--嗜好习惯发生异常,{}",e.getMessage());
			logger.error("{},{}",e.getMessage(),e);
			e.printStackTrace();
		}
		return result;
	}
	//获取最近一条嗜好
	@RequestMapping(value="/living/getHabit")
	@ResponseBody
	public Result<UserLivingHabit> getUserLivingHabit(UserLivingHabit habit){
		Result<UserLivingHabit> result = null;
		try{
			result = livingService.getLivingHabit(habit);
		}catch (Exception e){
			result = new Result<>();
			e.printStackTrace();
		}
		return result;
	}

	//保存生活习惯--运动
	@RequestMapping(value="/living/addMovement")
	@ResponseBody
	public Result<String> saveMovement(UserLivingMovement movement){
		Result<String> result = null;
		try{
			result = livingService.addLivingMovement(movement);
		}catch (Exception e){
			logger.error("保存生活习惯--运动习惯发生异常,{}",e.getMessage());
			logger.error("{},{}",e.getMessage(),e);
			e.printStackTrace();
		}
		return result;
	}
	//获取最近一条运动
	@RequestMapping(value="/living/getMovement")
	@ResponseBody
	public Result<UserLivingMovement> getUserLivingMovement(UserLivingMovement movement){
		Result<UserLivingMovement> result = null;
		try{
			result = livingService.getUserLivingMovement(movement);
		}catch (Exception e){
			result = new Result<>();
			e.printStackTrace();
		}
		return result;
	}

	//保存生活习惯--饮食
	@RequestMapping(value="/living/addMeal")
	@ResponseBody
	public Result<String> saveMovement(UserLivingMeal meal){
		Result<String> result = null;
		try{
			result = livingService.addUserLivingMeal(meal);
		}catch (Exception e){
			logger.error("保存生活习惯--饮食习惯发生异常,{}",e.getMessage());
			logger.error("{},{}",e.getMessage(),e);
			e.printStackTrace();
		}
		return result;
	}
	//获取最近一条饮食
	@RequestMapping(value="/living/getMeal")
	@ResponseBody
	public Result<UserLivingMeal> getUserLivingMeal(UserLivingMeal meal){
		Result<UserLivingMeal> result = null;
		try{
			result = livingService.getUserLivingMeal(meal);
		}catch (Exception e){
			result = new Result<>();
			e.printStackTrace();
		}
		return result;
	}

	//健康状况
	@RequestMapping(value = "/sick", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView sick(){
		return null;
	}
	//生理指标
	@RequestMapping(value = "/phy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView physiological(){
		return new ModelAndView("phy");
	}

	//保存生理指标--相关指标
	@RequestMapping(value="/phy/addPhy")
	@ResponseBody
	public Result<String> savePhy(UserPhysiological Phy){
		Result<String> result = null;
		try{
			result = livingService.addUserPhysiological(Phy);
		}catch (Exception e){
			logger.error("保存生理指标--相关指标发生异常,{}",e.getMessage());
			logger.error("{},{}",e.getMessage(),e);
			e.printStackTrace();
		}
		return result;
	}
	//获取最近一条生理指标--相关指标
	@RequestMapping(value="/phy/getPhy")
	@ResponseBody
	public Result<UserPhysiological> getPhy(UserPhysiological Phy){
		Result<UserPhysiological> result = null;
		try{
			result = livingService.getUserPhysiological(Phy);
		}catch (Exception e){
			result = new Result<>();
			e.printStackTrace();
		}
		return result;
	}

	//情绪认知（心理健康）
	@RequestMapping(value = "/psy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView psychological(){
		return new ModelAndView("psy");
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
