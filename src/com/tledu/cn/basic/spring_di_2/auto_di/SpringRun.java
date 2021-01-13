package com.tledu.cn.basic.spring_di_2.auto_di;


import com.tledu.cn.basic.spring_di_2.common_di.Hero;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringRun
{
	ApplicationContext applicationContext=null;

	@Test
	public void constructorDI(){
		Teacher tea= (Teacher) applicationContext.getBean("teacher");
		System.out.println(tea);
	}


	@Before
	public void loadEnv(){
		applicationContext=new ClassPathXmlApplicationContext("bean-auto-di.xml");
	}
}