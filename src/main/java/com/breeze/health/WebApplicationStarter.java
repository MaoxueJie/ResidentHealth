package com.breeze.health;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.breeze.health.filter.AuthenticationFilter;



@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.breeze.health.controller",
		"com.breeze.health.config",
		"com.breeze.health.service"})
@MapperScan(basePackages = {"com.breeze.health.mapper"})
public class WebApplicationStarter extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        new SpringApplication(WebApplicationStarter.class).run(args);
    }
    
    @Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowCredentials(true)
				.allowedHeaders("*")
				.allowedOrigins("*")
				.allowedMethods("*");
    }
}
