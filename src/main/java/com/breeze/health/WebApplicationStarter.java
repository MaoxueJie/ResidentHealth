package com.breeze.health;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.breeze.health.controller",
		"com.breeze.health.config"})
@MapperScan(basePackages = {"com.breeze.health.mapper"})
public class WebApplicationStarter extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplicationStarter.class);
    }

	
    public static void main(String[] args) {
        new SpringApplication(WebApplicationStarter.class).run(args);
    }

}
