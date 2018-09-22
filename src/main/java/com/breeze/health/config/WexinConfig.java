package com.breeze.health.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "wexin")
public class WexinConfig {
	
	private static String appid;
	private static String appsecret;
	private static String token;
	
	public static String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public static String getAppsecret() {
		return appsecret;
	}
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
	public static String getToken() {
		return token;
	}
	public  void setToken(String token) {
		WexinConfig.token = token;
	}
	
}
