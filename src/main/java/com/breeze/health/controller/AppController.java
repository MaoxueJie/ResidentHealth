package com.breeze.health.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.breeze.health.beans.vo.DoctorVo;
import com.breeze.health.beans.vo.Result;
import com.breeze.health.beans.vo.UserBaseInfoVo;
import com.breeze.health.beans.vo.UserLivingVo;
import com.breeze.health.beans.vo.UserPhysiologicalVo;
import com.breeze.health.beans.vo.UserPsySuicideVo;
import com.breeze.health.beans.vo.UserPsychologicalVo;
import com.breeze.health.beans.vo.UserSickVo;
import com.breeze.health.beans.vo.UserTCMVo;
import com.breeze.health.beans.vo.UserVo;
import com.breeze.health.service.AppService;
import com.breeze.health.service.DoctorService;
import com.breeze.health.service.LivingService;
import com.breeze.health.service.PhyService;
import com.breeze.health.service.PsyService;
import com.breeze.health.service.ReportService;
import com.breeze.health.service.SickService;
import com.breeze.health.service.TCMService;
import com.breeze.health.service.UserService;
import com.breeze.health.util.DesUtil;
import com.breeze.health.util.RequestUtils;


@Controller
@CrossOrigin(origins="*")
@RequestMapping("/app")
@SuppressWarnings("all")
public class AppController {
	
	@Autowired
	AppService appService;
	
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
	
	
	@RequestMapping(value = "/base/get")
	@ResponseBody
	public Result<UserBaseInfoVo> getUserInfo(HttpServletRequest request,Long userId){
		return userService.getBaseInfo(userId);
	}

	@RequestMapping(value="/living/get")
	@ResponseBody
	public Result<UserLivingVo> getUserLiving(HttpServletRequest request,Long userId){
		return livingService.getLiving(userId);
	}
		
	@ResponseBody
	@RequestMapping(value = "/sick/get")
	public Result<UserSickVo> getSick(HttpServletRequest request ,Long userId){
		return sickService.getSick(userId);
	}

	@RequestMapping(value="/phy/get")
	@ResponseBody
	public Result<UserPhysiologicalVo> getPhy(HttpServletRequest request,Long userId){
		return phyService.getPhy(userId);
	}
		
	@RequestMapping(value = "/tcm/get")
	@ResponseBody
	public Result<UserTCMVo> getTCM(HttpServletRequest request,Long userId){
		return tcmService.getTCM(userId);
	}
		
	@RequestMapping(value = "/psy/get")
	@ResponseBody
	public Result<UserPsychologicalVo> getPsychological(HttpServletRequest request,Long userId){
		return psyService.getPsy(userId);
	}
		
	@RequestMapping(value = "/psy/suicide/get")
	@ResponseBody
	public Result<UserPsySuicideVo> getPsychologicalSuicide(HttpServletRequest request,Long userId){
		return psyService.getPsySuicide(userId);
	}
	
}
