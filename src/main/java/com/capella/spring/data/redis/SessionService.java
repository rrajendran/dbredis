package com.capella.spring.data.redis;

public interface SessionService {
	public Long getSessionCount();

	void setSessionCount(long count);
}
