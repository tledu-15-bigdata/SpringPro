package com.tledu.cn.basic.spring_config_3.actual;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.sql.Connection;
import java.sql.DriverManager;
//设定数据库连接
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	/**
	 * 创建一个数据源，并存入 spring 容器中
	 * 
	 * @return
	 */
	@Bean(name = "dataSource")
	public Connection createDataSource() {
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,username,password);
			return conn;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
