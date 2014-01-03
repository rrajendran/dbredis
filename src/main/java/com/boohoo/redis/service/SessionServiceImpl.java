package com.boohoo.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service("sessionService")
public class SessionServiceImpl implements SessionService{
	
	@Autowired
	RedisTemplate<String, String> redisTemplate;
	
	public Long getSessionCount() { 
		return redisTemplate.boundValueOps("pageViews").increment(1l);
	}

}
