package com.breeze.health.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SuppressWarnings("all")
public class HealthController {
	private static Logger logger = LoggerFactory.getLogger(HealthController.class);

	@RequestMapping(value = "/base", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView userInfo(){
		ModelAndView view = new ModelAndView();
		view.setViewName("user");
		return view;
	}
	
	@RequestMapping(value = "/report", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView report(){
		return null;
	}
	

	@RequestMapping(value = "/living", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView living(){
		return null;
	}
	
	@RequestMapping(value = "/sick", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView sick(){
		return null;
	}
	
	@RequestMapping(value = "/phy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView physiological(){
		return null;
	}
	
	@RequestMapping(value = "/psy", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView psychological(){
		return null;
	}
	
}
