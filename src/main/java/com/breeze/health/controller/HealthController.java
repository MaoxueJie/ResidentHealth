package com.breeze.health.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserLivingVo;
import com.breeze.health.beans.vo.UserPhysiologicalVo;
import com.breeze.health.beans.vo.UserPsySuicideVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserReportVo;
import com.breeze.health.beans.vo.UserSickVo;
import com.breeze.health.beans.vo.UserTCMVo;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.entity.UserBaseInfo;
import com.breeze.health.entity.UserLivingHabit;
import com.breeze.health.entity.UserLivingMeal;
import com.breeze.health.entity.UserLivingMovement;
import com.breeze.health.entity.UserPhysiological;
import com.breeze.health.service.LivingService;
import com.breeze.health.service.PhyService;
import com.breeze.health.service.PsyService;
import com.breeze.health.service.ReportService;
import com.breeze.health.service.SickService;
import com.breeze.health.service.TCMService;
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
import org.springframework.web.servlet.view.RedirectView;

import com.breeze.health.config.Config;
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
	@Resource
	private PhyService phyService;
	@Resource
	private TCMService tcmService;
	
	@RequestMapping(value = "/home", method = {RequestMethod.GET,RequestMethod.POST})
	
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response){
		String path = Config.getBasepath();
		return new ModelAndView(new RedirectView(path+"static/home.html"));
	}
	
	@RequestMapping(value = "/base/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserBaseInfoVo> getUserInfo(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return userService.getBaseInfo(user.getId());
	}
	
	@RequestMapping(value = "/base/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addUserInfo(HttpServletRequest request, HttpServletResponse response,UserBaseInfoVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(user.getId());
		return userService.addOrUpdateBaseInfo(vo);
	}
	
	//查看报告
	@RequestMapping(value = "/report/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserReportVo> getReport(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return reportService.getReprot(user.getId());
	}
	

	//保存生活习惯--嗜好
	@RequestMapping(value="/living/add")
	@ResponseBody
	public Result<Void> saveLiving(HttpServletRequest request,UserLivingVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(user.getId());
		return livingService.addOrUpdateLiving(vo);
	}
	//获取最近一条嗜好
	@RequestMapping(value="/living/get")
	@ResponseBody
	public Result<UserLivingVo> getUserLiving(HttpServletRequest request){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return livingService.getLiving(user.getId());
	}

	//健康状况
	@ResponseBody
	@RequestMapping(value = "/sick/get", method = {RequestMethod.GET,RequestMethod.POST})
	public Result<UserSickVo> getSick(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return sickService.getSick(user.getId());
	}
	
	//健康状况
	@RequestMapping(value = "/sick/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addSick(HttpServletRequest request,UserSickVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(user.getId());
		return sickService.addOrUpdateSick(vo);
	}

	//保存生理指标--相关指标
	@RequestMapping(value="/phy/add")
	@ResponseBody
	public Result<Void> savePhy(HttpServletRequest request,UserPhysiologicalVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(user.getId());
		return phyService.addOrUpdatePhy(vo);
	}
	//获取最近一条生理指标--相关指标
	@RequestMapping(value="/phy/get")
	@ResponseBody
	public Result<UserPhysiologicalVo> getPhy(HttpServletRequest request){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return phyService.getPhy(user.getId());
	}
	
	//情绪认知（心理健康）
	@RequestMapping(value = "/tcm/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addTCM(HttpServletRequest request,UserTCMVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(user.getId());
		return tcmService.addOrUpdateTCM(vo);
	}
	
	@RequestMapping(value = "/tcm/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserTCMVo> getTCM(HttpServletRequest request){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return tcmService.getTCM(user.getId());
	}
	
	//情绪认知（心理健康）
	@RequestMapping(value = "/psy/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addPsychological(HttpServletRequest request,UserPsychologicalVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(user.getId());
		return psyService.addOrUpdatePsy(vo);
	}
	
	@RequestMapping(value = "/psy/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserPsychologicalVo> getPsychological(HttpServletRequest request){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return psyService.getPsy(user.getId());
	}
	

	@RequestMapping(value = "/psy/suicide/add", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<Void> addPsychologicalSuicide(HttpServletRequest request, HttpServletResponse response,UserPsySuicideVo vo){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		vo.setUserId(user.getId());
		return psyService.addOrUpdatePsySuicide(vo);
	}
	
	@RequestMapping(value = "/psy/suicide/get", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result<UserPsySuicideVo> getPsychologicalSuicide(HttpServletRequest request, HttpServletResponse response){
		UserVo user = (UserVo)request.getSession().getAttribute("user");
		return psyService.getPsySuicide(user.getId());
	}
}
