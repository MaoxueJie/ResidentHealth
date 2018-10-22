package com.breeze.health.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.breeze.health.filter.AuthenticationFilter;
import com.breeze.health.service.UserService;

@Configuration
public class ApplicationConfig {
	@Bean
    public FilterRegistrationBean  filterRegistrationBean(UserService userService) {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		AuthenticationFilter authFilter = new AuthenticationFilter();
		authFilter.setUserService(userService);
		registrationBean.setFilter(authFilter);
		List<String> urlPatterns = new ArrayList<String>();
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
}
