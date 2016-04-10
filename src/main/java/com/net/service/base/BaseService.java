package com.net.service.base;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseService {
	
	@Autowired
	@Qualifier("writeSqlSession")
	protected SqlSession writeSqlSession;

	public void setWriteSqlSession(SqlSession writeSqlSession) {
		this.writeSqlSession = writeSqlSession;
	}
}
