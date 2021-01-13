package com.tledu.cn.basic.spring_bean_1.cn;

import com.tledu.cn.basic.spring_bean_1.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    //读取spring配置文件
        ApplicationContext applicationContext=
            new ClassPathXmlApplicationContext("bean-constructor-di.xml");
        Student stu1= (Student) applicationContext.getBean("myStudent");




        System.out.println(stu1.getName());
        stu1.setAge(30);
        Student stu2= (Student) applicationContext.getBean("myStudent");

        System.out.println(stu1==stu2);
        System.out.println(stu2);




    }
}
