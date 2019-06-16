package com.breeze.health;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.breeze.health.controller",
		"com.breeze.health.config",
		"com.breeze.health.service"})
@MapperScan(basePackages = {"com.breeze.health.mapper","com.breeze.health.mapper.custom"})
public class WebApplicationStarter extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        new SpringApplication(WebApplicationStarter.class).run(args);
    }
    
    @Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/app/**")
				.allowCredentials(true)
				.allowedHeaders("*")
				.allowedOrigins("*")
				.allowedMethods("*");
    }
}
