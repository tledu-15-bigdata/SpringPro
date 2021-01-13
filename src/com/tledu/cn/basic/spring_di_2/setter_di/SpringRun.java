package com.tledu.cn.basic.spring_di_2.setter_di;

import com.tledu.cn.basic.spring_di_2.constuctor_di.Teacher;
import com.tledu.cn.basic.spring_di_2.setter_di.impl.Chinese;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringRun
{
	ApplicationContext applicationContext=null;

	@Test
	public void constructorDI(){
		Chinese tea= (Chinese) applicationContext.getBean("chinese");
		System.out.println(tea);
		tea.useAxe();
	}


	@Before
	public void loadEnv(){
		applicationContext=new ClassPathXmlApplicationContext("bean-setter-di.xml");
	}
}