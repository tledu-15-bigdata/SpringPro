package com.tledu.cn.basic.spring_config_3.actual;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;


public class BeanTest
{
	public static void main(String[] args)throws Exception
	{
		ApplicationContext ctx = new
				AnnotationConfigApplicationContext(MyJavaConfig.class);
		Teacher t = ctx.getBean("teacher" , Teacher.class);
		System.out.println(t.getStudent().getName());
		System.out.println(t);

		Connection conn= (Connection) ctx.getBean("dataSource");
		System.out.println(conn==null);
	}
}