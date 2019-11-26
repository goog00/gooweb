package com.googoo.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

//@EnableRedisHttpSession
public class Config {

	@Value("${spring.redis.host}")
	private String hostName;
	@Value("${spring.redis.port}")
	private int port;
	@Value("${spring.redis.password}")
	private String password;
	@Value("${spring.redis.database}")
	private int database;

	@Bean
	public LettuceConnectionFactory connectionFactory() {
		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory();
		lettuceConnectionFactory.setDatabase(3);
		lettuceConnectionFactory.setPort(port);
		lettuceConnectionFactory.setPassword(password);
		lettuceConnectionFactory.setHostName(hostName);
		return lettuceConnectionFactory;
	}
}