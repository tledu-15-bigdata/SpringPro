package com.tledu.cn.basic.spring_anno_di_4;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringRun
{
	ApplicationContext applicationContext=null;

	@Test
	public void constructorDI(){
		Student tea= (Student) applicationContext.getBean("student");
		System.out.println(tea);
	}


	@Before
	public void loadEnv(){
		applicationContext=new ClassPathXmlApplicationContext("bean-annotation-di.xml");
	}
}