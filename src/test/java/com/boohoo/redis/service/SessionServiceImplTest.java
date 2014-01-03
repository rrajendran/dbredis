package com.boohoo.redis.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class SessionServiceImplTest {
	
	@Autowired
	SessionService sessionService;
	
	@Test
	public void test(){
		Long sessionCount = 0l;
		for (int i = 0; i < Integer.parseInt("999999"); i++) {
			sessionCount = sessionService.getSessionCount();
		}
	
		System.out.println(sessionCount);
	}
}
