package com.iemr.common.identity.utils;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.RedisHttpSessionConfiguration;

import com.iemr.common.identity.utils.config.ConfigProperties;
import com.iemr.common.identity.utils.redis.RedisStorage;

@EnableAutoConfiguration
public class CommonMain {
	@Bean
	public ConfigProperties configProperties() {
		return new ConfigProperties();
	}

	@Bean
	public RedisHttpSessionConfiguration redisSession() {
		return new RedisHttpSessionConfiguration();
	}

	@Bean
	public RedisStorage redisStorage() {
		return new RedisStorage();
	}
}
