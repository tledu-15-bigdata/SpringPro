package com.tledu.cn.basic.spring_config_3.learn;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
   ApplicationContext context=null;

    @Before
    public void berfore(){
      context = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }
    @Test
    public void work1(){
      User user= (User) context.getBean("myUser");
      user.sayHello();
    }
}