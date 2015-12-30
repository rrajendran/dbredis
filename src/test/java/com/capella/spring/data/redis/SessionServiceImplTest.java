package com.capella.spring.data.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class SessionServiceImplTest {
	
	@Autowired
	private SessionService sessionService;

	@Test
	public void test(){
		sessionService.setSessionCount(10L);
		assertEquals(Long.valueOf(10l),sessionService.getSessionCount());
	}


}
