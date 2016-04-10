package com.maven.base;

import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class BaseTest {
	
	private static ApplicationContext ctx_producer = null;
	public static ApplicationContext ctx = null;

	public static void init() {
		if (ctx_producer != null) {
			return;
		}

		String[] configLocations = new String[] {"applicationContext.xml"};

		ctx_producer = new ClassPathXmlApplicationContext(configLocations);
	}

	public static ApplicationContext getContext() {
		init();
		return ctx_producer;
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = getContext();
	}
}
