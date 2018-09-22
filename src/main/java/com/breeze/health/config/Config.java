package com.breeze.health.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class Config {
	private static String basepath;

	public static String getBasepath() {
		if (basepath.endsWith("/"))
			return basepath;
		else
			return basepath + "/";
	}

	public static void setBasepath(String basepath) {
		Config.basepath = basepath;
	}

}
