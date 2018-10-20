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
	    urlPatterns.add("/user/*");
	    registrationBean.setUrlPatterns(urlPatterns);
	    return registrationBean;
    }
}
