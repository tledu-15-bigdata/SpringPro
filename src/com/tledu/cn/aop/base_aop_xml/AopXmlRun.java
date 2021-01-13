package com.tledu.cn.aop.base_aop_xml;

import com.tledu.cn.aop.IUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName AopXmlRun
 * @Description TODO
 * @Author YouLi
 * @Date 2018/4/17 21:42
 **/
public class AopXmlRun {

    public static void main(String[] args)  {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext_aopxml.xml");

//        IUserDao iUserDao= (IUserDao) app.getBean("userDao");
//        iUserDao.save();
        System.out.println("===============================");
        OrderDao orderDao= (OrderDao) app.getBean("orderDao");
//        try {
            orderDao.save(1,"2");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("出错误了");
//        }
    }
}
