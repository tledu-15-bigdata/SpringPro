package com.tledu.cn.basic.spring_di_2.constuctor_di;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName SpringRun
 * @Description TODO
 * @Author YouLi
 * @Date 2018/4/16 20:55
 **/
public class SpringRun {
//    public static void main(String[] args) {
////        加载Spring配置文件
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-constructor-di.xml");
//        Teacher teacher= (Teacher) applicationContext.getBean("myTeacher");
//        System.out.println(teacher);
//
//        System.out.println("-------------");
//
//        //        Dog dog= (Dog) applicationContext.getBean("myDog");
//        //        System.out.println(dog);
//
//        ApplicationContext app2=new AnnotationConfigApplicationContext(Teacher.class);
//        Teacher ta=app2.getBean(Teacher.class);
//        System.out.println(ta);
//
//
//        //        注解注入测试
//
//
//    }
    ApplicationContext applicationContext=null;

    @Test
    public void constructorDI(){
        Teacher tea= (Teacher) applicationContext.getBean("myTeacher");
        System.out.println(tea);
    }
    

    @Before
    public void loadEnv(){
         applicationContext=new ClassPathXmlApplicationContext("bean-constructor-di.xml");
    }
}
