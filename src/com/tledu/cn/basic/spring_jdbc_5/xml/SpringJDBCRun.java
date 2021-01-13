package com.tledu.cn.basic.spring_jdbc_5.xml;

import com.tledu.cn.basic.spring_jdbc_5.xml.dao.SpringDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class SpringJDBCRun {

    ApplicationContext applicationContext=null;

    @Test
    public void constructorDI() throws SQLException {
//        myService
        SpringDao tea= (SpringDao) applicationContext.getBean("springDao");
//        int work = tea.work(1, 3);
        tea.insertDept();
        tea.updateDept();

        System.out.println(tea.queryAll());
        System.out.println(tea.queryAll2());
        System.out.println(tea.querySingle1());
        System.out.println(tea.querySingle2());
        System.out.println(tea.querySingle3());
        tea.deleteDept();

//        System.out.println(tea.queryAll());
    }


    @Before
    public void loadEnv(){
        applicationContext=new ClassPathXmlApplicationContext("spring-jdbc.xml");
    }

}
