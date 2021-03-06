package com.breeze.health.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.breeze.health.filter.AppAuthenticationFilter;
import com.breeze.health.filter.AuthenticationFilter;
import com.breeze.health.service.DoctorService;
import com.breeze.health.service.UserService;

@Configuration
public class ApplicationConfig {
	@Bean
    public FilterRegistrationBean  authFilter(UserService userService) {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		AuthenticationFilter authFilter = new AuthenticationFilter();
		authFilter.setUserService(userService);
		registrationBean.setFilter(authFilter);
		List<String> urlPatterns = new ArrayList<String>();
		//urlPatterns.add("/home");
	    urlPatterns.add("/base/add");
	    urlPatterns.add("/base/get");
	    urlPatterns.add("/living/add");
	    urlPatterns.add("/living/get");
	    urlPatterns.add("/sick/add");
	    urlPatterns.add("/sick/get");
	    urlPatterns.add("/phy/add");
	    urlPatterns.add("/phy/get");
	    urlPatterns.add("/psy/add");
	    urlPatterns.add("/psy/get");
	    urlPatterns.add("/tcm/add");
	    urlPatterns.add("/tcm/get");
	    urlPatterns.add("/psy/suicide/add");
	    urlPatterns.add("/psy/suicide/get");
	    urlPatterns.add("/report/get");
	    registrationBean.setUrlPatterns(urlPatterns);
	    return registrationBean;
    }
	
	@Bean
    public FilterRegistrationBean  appAuthFilter(DoctorService doctorService) {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		AppAuthenticationFilter authFilter = new AppAuthenticationFilter();
		authFilter.setDoctorService(doctorService);
		registrationBean.setFilter(authFilter);
		List<String> urlPatterns = new ArrayList<String>();
	    urlPatterns.add("/app/test");
	    urlPatterns.add("/app/getUser");
	    urlPatterns.add("/app/changePwd");
	    urlPatterns.add("/app/getSicks");
	    urlPatterns.add("/app/getSicks_new");
	    urlPatterns.add("/app/base/get");
	    urlPatterns.add("/app/living/get");
	    urlPatterns.add("/app/living/date");
	    urlPatterns.add("/app/living/id");
	    urlPatterns.add("/app/sick/get");
	    urlPatterns.add("/app/phy/get");
	    urlPatterns.add("/app/phy/date");
	    urlPatterns.add("/app/phy/id");
	    urlPatterns.add("/app/psy/get");
	    urlPatterns.add("/app/psy/date");
	    urlPatterns.add("/app/psy/id");
	    urlPatterns.add("/app/tcm/get");
	    urlPatterns.add("/app/psy/suicide/get");
	    urlPatterns.add("/app/favorites/getSicks");
	    urlPatterns.add("/app/favorites/add");
	    urlPatterns.add("/app/favorites/remove");
	    urlPatterns.add("/app/favorites/check");
	    urlPatterns.add("/app/msgs");
	    urlPatterns.add("/app/msg/get");
	    urlPatterns.add("/app/add");
	    urlPatterns.add("/app/getLink");
	    urlPatterns.add("/app/updateLink");
	    registrationBean.setUrlPatterns(urlPatterns);
	    return registrationBean;
    }
}
