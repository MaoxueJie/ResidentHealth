package com.breeze.health.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserReportVo;
import com.breeze.health.beans.vo.UserSickVo;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.entity.UserBaseInfo;
import com.breeze.health.entity.UserLivingHabit;
import com.breeze.health.entity.UserLivingMeal;
import com.breeze.health.entity.UserLivingMovement;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.service.LivingService;
import com.breeze.health.service.PsyService;
import com.breeze.health.service.ReportService;
import com.breeze.health.service.SickService;
import com.breeze.health.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.PathVariable;
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
	@Resource
	private UserService userService;
	@Resource
	private ReportService reportService;
	@Resource
	private SickService sickService;
	@Resource
	private PsyService psyService;
	//基本信息
	@RequestMapping(value = "/base", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView userInfo(HttpServletRequest request, HttpServletResponse response){
		return new ModelAndView("base");
	}
	//查看报告
	@RequestMapping(value = "/report", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView report(){
		return new ModelAndView("report");
	}
	
	@RequestMapping(value = "/base/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserBaseInfoVo> getUserInfo(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return userService.getBaseInfo(1l);
	}
	
	@RequestMapping(value = "/base/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addUserInfo(HttpServletRequest request, HttpServletResponse response,UserBaseInfoVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(1l);
		return userService.addOrUpdateBaseInfo(vo);
	}
	
	//查看报告
	@RequestMapping(value = "/report/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserReportVo> getReport(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return reportService.getReprot(1l);
	}
	
	//生活习惯
	@RequestMapping(value = "/living", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView living(){
		return new ModelAndView("living");
	}
	/*
	//保存生活习惯--嗜好
	@RequestMapping(value="/living/habit/add")
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
	@RequestMapping(value="/living/habit/get")
	@ResponseBody
	public Result<UserLivingHabit> getUserLivingHabit(UserLivingHabit habit){
		Result<UserLivingHabit> result = null;
		try{
			result = livingService.getLivingHabit(habit);
		}catch (Exception e){
			result = new Result<UserLivingHabit>();
			e.printStackTrace();
		}
		return result;
	}

	//保存生活习惯--运动
	@RequestMapping(value="/living/movement/add")
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
	@RequestMapping(value="/living/movement/get")
	@ResponseBody
	public Result<UserLivingMovement> getUserLivingMovement(UserLivingMovement movement){
		Result<UserLivingMovement> result = null;
		try{
			result = livingService.getUserLivingMovement(movement);
		}catch (Exception e){
			result = new Result<UserLivingMovement>();
			e.printStackTrace();
		}
		return result;
	}

	//保存生活习惯--饮食
	@RequestMapping(value="/living/meal/add")
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
	@RequestMapping(value="/living/meal/get")
	@ResponseBody
	public Result<UserLivingMeal> getUserLivingMeal(UserLivingMeal meal){
		Result<UserLivingMeal> result = null;
		try{
			result = livingService.getUserLivingMeal(meal);
		}catch (Exception e){
			result = new Result<UserLivingMeal>();
			e.printStackTrace();
		}
		return result;
	}

	//健康状况
	@RequestMapping(value = "/sick", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView sick(){
		return new ModelAndView("sick");
	}
	//健康状况
	@ResponseBody
	@RequestMapping(value = "/sick/get", method = {RequestMethod.GET,RequestMethod.POST})
	public Result<UserSickVo> getSick(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return sickService.getSick(1l);
	}
	
	//健康状况
	@RequestMapping(value = "/sick/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addSick(HttpServletRequest request, HttpServletResponse response,UserSickVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(1l);
		return sickService.addOrUpdateSick(vo);
	}
	//生理指标
	@RequestMapping(value = "/phy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView physiological(){
		return new ModelAndView("phy");
	}

	//保存生理指标--相关指标
	@RequestMapping(value="/phy/add")
	@ResponseBody
	public Result<String> savePhy(UserPhysiological Phy){
		Result<String> result = null;
		try{
			Phy.setUserId(1l);
			result = livingService.addUserPhysiological(Phy);
		}catch (Exception e){
			logger.error("保存生理指标--相关指标发生异常,{}",e.getMessage());
			logger.error("{},{}",e.getMessage(),e);
			e.printStackTrace();
		}
		return result;
	}
	//获取最近一条生理指标--相关指标
	@RequestMapping(value="/phy/get")
	@ResponseBody
	public Result<UserPhysiological> getPhy(UserPhysiological Phy){
		Result<UserPhysiological> result = null;
		try{
			Phy.setUserId(1l);
			result = livingService.getUserPhysiological(Phy);
		}catch (Exception e){
			result = new Result<UserPhysiological>();
			e.printStackTrace();
		}
		return result;
	}

	
	//情绪认知（心理健康）
	@RequestMapping(value = "/{file}", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView psychological(@PathVariable String file){
		return new ModelAndView(file);
	}
	
	//情绪认知（心理健康）
	@RequestMapping(value = "/psy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView psychological(){
		return new ModelAndView("psy");
	}

	@RequestMapping(value = "/psy/ad8/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addPsychologicalAD8(HttpServletRequest request, HttpServletResponse response,UserPsychologicalVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		
		return psyService.addOrUpdatePsyAD8(vo);
	}
	
	@RequestMapping(value = "/psy/ad8/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserPsychologicalVo> getPsychologicalAD8(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return psyService.getPsyAd8(1l);
	}
	
	@RequestMapping(value = "/psy/gad7/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addPsychologicalGAD7(HttpServletRequest request, HttpServletResponse response,UserPsychologicalGAD7Vo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(1l);
		return psyService.addOrUpdatePsyGAD7(vo);
	}
	
	@RequestMapping(value = "/psy/gad7/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserPsychologicalGAD7Vo> getPsychologicalGAD7(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return psyService.getPsyGAD7(1l);
	}
	
	@RequestMapping(value = "/psy/phq9/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addPsychologicalPHQ9(HttpServletRequest request, HttpServletResponse response,UserPsychologicalPHQ9Vo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(1l);
		return psyService.addOrUpdatePsyPHQ9(vo);
	}
	
	@RequestMapping(value = "/psy/phq9/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserPsychologicalPHQ9Vo> getPsychologicalPHQ9(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return psyService.getPsyPHQ9(1l);
	}*/
}
