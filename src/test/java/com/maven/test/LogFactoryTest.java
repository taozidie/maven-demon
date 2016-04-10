package com.maven.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFactoryTest {
	public static Logger logger = LoggerFactory.getLogger(LogFactoryTest.class);
	
	@Test
	public void testloger(){
		logger.info("hello this is taozi's log @author: 【{}】 @time: 【{}】","zgt","2016-04-07 14:50:32");
	}
}
