package com.maven.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysqlContentTest {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	final String driver = "com.mysql.jdbc.Driver";

	final String url = "jdbc:mysql://115.159.196.135:3307/yifangwang_dev";

	final String user = "xu_papapa_dev";

	final String password = "86_345fde008401";

	@Test
	public void testName() throws Exception {
		Connection con;
		long start = System.currentTimeMillis();
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, password);

			if(!con.isClosed()){
				logger.info("Successed connecting to the Database!");;
			}else{
				logger.info("Connected failed ！！！");
			}
//			method 1
			Statement createStatement = con.createStatement();
			String sql="select count(id) as num ,communityName from ifang_community group by communityName having num > 0 limit 10";
			ResultSet executeQuery = createStatement.executeQuery(sql);
			
//			method 2
//			String sql="select count(id) as num ,communityName from ifang_community group by communityName having num > ? limit ?";
//			PreparedStatement prepareStatement = con.prepareStatement(sql);
//			prepareStatement.setInt(1, 0);
//			prepareStatement.setInt(2, 10);
//			ResultSet executeQuery = prepareStatement.executeQuery();
			
			logger.info("-------------------");
			logger.info("执行结果如下：");
			logger.info("-------------------");
			logger.info("数量\t小区名称");
			logger.info("-------------------");
			
			while (executeQuery.next()) {
				String num = executeQuery.getString("num");
				String communityName = executeQuery.getString("communityName");
				logger.info(num+"\t"+communityName);
			}
			
			executeQuery.close();
			con.close();
		} catch (Exception e) {
			logger.info("runtime exception:【{}】",e);
		}finally{
			logger.info("Successed  executeQuery ending. 总时长:【{}】",(System.currentTimeMillis()-start)+"毫秒");
		}
	}
}
