package com.tledu.cn.actual;

import com.tledu.cn.actual.dao.MyDao;
import com.tledu.cn.actual.service.MyService;
import com.tledu.cn.basic.spring_di_2.setter_di.impl.Chinese;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


public class SpringRun {
    ApplicationContext



            applicationContext=null;





    @Test
    public void constructorDI(){
//        myService
        System.out.println(111);
        MyService tea= (MyService) applicationContext.getBean("myService");
        int work = tea.work(1, 3);
        System.out.println(work);
    }


    @Before
    public void loadEnv(){
        applicationContext=new ClassPathXmlApplicationContext("bean-actual.xml");
    }

}
