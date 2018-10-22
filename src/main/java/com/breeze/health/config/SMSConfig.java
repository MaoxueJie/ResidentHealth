package com.breeze.health.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "sms")
public class SMSConfig {
	
	private static Integer appid;
	private static String appkey;
	public static Integer getAppid() {
		return appid;
	}
	public static void setAppid(Integer appid) {
		SMSConfig.appid = appid;
	}
	public static String getAppkey() {
		return appkey;
	}
	public static void setAppkey(String appkey) {
		SMSConfig.appkey = appkey;
	}
	
}
