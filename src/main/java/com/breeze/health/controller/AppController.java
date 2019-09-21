package com.breeze.health.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
import com.breeze.health.beans.vo.req.SicksQuery;
import com.breeze.health.config.Config;
import com.breeze.health.entity.DoctorMsg;
import com.breeze.health.service.AppService;
import com.breeze.health.service.DoctorService;
import com.breeze.health.service.LivingService;
import com.breeze.health.service.PhyService;
import com.breeze.health.service.PsyService;
import com.breeze.health.service.ReportService;
import com.breeze.health.service.SickService;
import com.breeze.health.service.TCMService;
import com.breeze.health.service.UserService;
import com.breeze.health.service.impl.AppServiceImpl;
import com.breeze.health.util.DesUtil;
import com.breeze.health.util.RequestUtils;


@Controller
@CrossOrigin(origins="*")
@RequestMapping("/app")
@SuppressWarnings("all")
public class AppController{
	private static Logger logger = LoggerFactory.getLogger(AppController.class);
	@Autowired
	AppService appService;
	
	@Resource
	private LivingService livingService;
	@Resource
	private UserService userService;
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
	
	@RequestMapping(value="/add")
	@ResponseBody
	public Result<Void> add(HttpServletRequest request, String mobile,String name,String jobTitle,String unit){
		Result<Void> ret = null;
		DoctorVo doc = (DoctorVo)request.getAttribute("user");
		if (doc!=null && doc.getAdmin()!=null && doc.getAdmin()==1)
		{
			ret = doctorService.addDoctor(mobile, name, jobTitle, unit);
		}else {
			ret = new Result<Void>();
			ret.setSuccess(false);
			ret.setMessage("没有权限");
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
		SicksQuery query = new SicksQuery();
		query.setMobile(mobile);
		query.setPage(page);
		query.setSize(size);
		Result<List> ret = appService.getUsersPage(((DoctorVo)request.getAttribute("user")).getId(),query);
		return ret; 
	}
	
	@RequestMapping(value="/getSicks_new")
	@ResponseBody
	public Result<List> getSicksNew(HttpServletRequest request,@RequestBody SicksQuery query){
		Result<List> ret = appService.getUsersPage(((DoctorVo)request.getAttribute("user")).getId(),query);
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
	
	@RequestMapping(value="/living/date")
	@ResponseBody
	public Result<List<UserLivingVo>> getUserLivingDate(HttpServletRequest request,Long userId){
		return livingService.getLivingDate(userId);
	}
	
	@RequestMapping(value="/living/id")
	@ResponseBody
	public Result<UserLivingVo> getUserLivingById(HttpServletRequest request,Long id){
		return livingService.getLivingById(id);
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
	
	@RequestMapping(value="/phy/date")
	@ResponseBody
	public Result<List<UserPhysiologicalVo>> getPhyDate(HttpServletRequest request,Long userId){
		return phyService.getPhyDate(userId);
	}
	
	@RequestMapping(value="/phy/id")
	@ResponseBody
	public Result<UserPhysiologicalVo> getPhyById(HttpServletRequest request,Long id){
		return phyService.getPhyById(id);
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
	@RequestMapping(value = "/psy/date")
	@ResponseBody
	public Result<List<UserPsychologicalVo>> getPsychologicalDate(HttpServletRequest request,Long userId){
		return psyService.getPsyDate(userId);
	}
	@RequestMapping(value = "/psy/id")
	@ResponseBody
	public Result<UserPsychologicalVo> getPsychologicalById(HttpServletRequest request,Long id){
		return psyService.getPsyById(id);
	}
		
	@RequestMapping(value = "/psy/suicide/get")
	@ResponseBody
	public Result<UserPsySuicideVo> getPsychologicalSuicide(HttpServletRequest request,Long userId){
		return psyService.getPsySuicide(userId);
	}
	
	@RequestMapping(value="/favorites/getSicks")
	@ResponseBody
	public Result<List> getFavoritesSicks(HttpServletRequest request,Integer page,Integer size){
		return appService.getFavorites(((DoctorVo)request.getAttribute("user")).getId(), page, size);
	}
	
	@RequestMapping(value="/favorites/add")
	@ResponseBody
	public Result<Void> addFavoritesSicks(HttpServletRequest request,Long userId){
		return appService.addFavorites(((DoctorVo)request.getAttribute("user")).getId(), userId);
	}
	
	@RequestMapping(value="/favorites/remove")
	@ResponseBody
	public Result<Void> removeFavoritesSicks(HttpServletRequest request,Long userId){
		return appService.removeFavorites(((DoctorVo)request.getAttribute("user")).getId(), userId);
	}
	
	@RequestMapping(value="/favorites/check")
	@ResponseBody
	public Result<Void> checkInFavorites(HttpServletRequest request,Long userId){
		return appService.checkFavorites(((DoctorVo)request.getAttribute("user")).getId(), userId);
	}
	
	@RequestMapping(value="/msgs")
	@ResponseBody
	public Result<List> getMessages(HttpServletRequest request,Long max,Long min,Integer page,Integer size){
		return appService.getDocMsgs(((DoctorVo)request.getAttribute("user")).getId(),max,min, page, size);
	}
	
	@RequestMapping(value="/msg/get")
	@ResponseBody
	public Result<DoctorMsg> getMessage(HttpServletRequest request,Long msgId){
		return appService.getDocMsgById(msgId);
	}
	
	@RequestMapping(value="/getLink")
	@ResponseBody
	public Result<String> getLink(HttpServletRequest request){
		Result<String> ret = new Result<String>();
		Properties prop = new Properties();
		 		FileInputStream inStream = null;
		  		try {
		  			logger.info("config="+Config.getConfig());
		  			inStream = new FileInputStream(Config.getConfig());
		  			prop.load(inStream);//加载数据
		  			//http://pku_ehealth.baiduux.com/h5/cfbff22c-82be-d15c-1dea-6aba6fb1e276.html
		  			ret.setData(prop.getProperty("link"));
		  		} catch (IOException e) {
		  			logger.error("",e);
		  		} finally{
		  			if(inStream != null){
		  				try {
		  					inStream.close();
		  				} catch (IOException e) {
		  					logger.error("",e);
		 					throw new RuntimeException(e);
		  				}
		  		}
		}
		ret.setSuccess(true);
		
		return ret;
	}
	@RequestMapping(value="/updateLink")
	@ResponseBody
	public Result<Void> updateLink(HttpServletRequest request, String link){
		Result<Void> ret = null;
		DoctorVo doc = (DoctorVo)request.getAttribute("user");
		if (doc!=null && doc.getAdmin()!=null && doc.getAdmin()==1)
		{
			Properties prop = new Properties();
			prop.setProperty("link", link);
			FileOutputStream fos = null;
			try {
			 	fos = new FileOutputStream(Config.getConfig());
			 	prop.store(fos, "link");//第二个参数为注释信息
			} catch (IOException e) {
				logger.error("",e);
	  		} finally{
	  			if(fos != null){
	  				try {
	  					fos.close();
	  				} catch (IOException e) {
	  					logger.error("",e);
	  					throw new RuntimeException(e);
	  				}
	  			}
	  		}
			ret = new Result<Void>();
			ret.setSuccess(true);
		}else {
			ret = new Result<Void>();
			ret.setSuccess(false);
			ret.setMessage("没有权限");
		}
		return ret;
	}
}
