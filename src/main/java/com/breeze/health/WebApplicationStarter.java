package com.breeze.health;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.breeze.health.controller"})
public class WebApplicationStarter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        new SpringApplication(WebApplicationStarter.class).run(args);
    }

}
