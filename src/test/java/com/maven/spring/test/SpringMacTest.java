package com.maven.spring.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.maven.base.BaseTest;
import com.net.service.IUserService;

public class SpringMacTest extends BaseTest{
	
	
	@Test
	public void queryuser() throws Exception {
		IUserService userService = ctx.getBean(IUserService.class);
		
		List<Map<String, Object>> qeuryAllUser = userService.qeuryAllUser();
		
		System.out.println("result is ："+qeuryAllUser);
	}
}

