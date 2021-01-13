package com.tledu.cn.aop.aop_anno;

import com.tledu.cn.aop.aop_anno.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopAnnoRun {
    ApplicationContext applicationContext=null;

    @Before
    public void load(){
        System.out.println("111");
        applicationContext= new AnnotationConfigApplicationContext(AnnotationAopConfig.class);
    }

    @Test
    public void runing(){
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userService.add();
        System.out.println("-=-=-=-=-=-=-=");
        userService.edit();
    }
}
