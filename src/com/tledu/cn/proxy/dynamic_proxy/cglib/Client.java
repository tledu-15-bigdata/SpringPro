package com.tledu.cn.proxy.dynamic_proxy.cglib;

import com.tledu.cn.proxy.dynamic_proxy.jdk.UserManagerImpl;
import com.tledu.cn.proxy.static_proxy.RealMovie;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        // 通过CGLIB动态代理获取代理对象的过程

//            runHellowService();
        runUserManager();
//        runMoive();
    }

    public static void runUserManager(){
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(UserManagerImpl.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());

        UserManagerImpl realMovie= (UserManagerImpl) enhancer.create();
        realMovie.addUser("1","2");
        realMovie.delUser("zs");
    }

    public static void runMoive(){
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(RealMovie.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());

        RealMovie realMovie= (RealMovie) enhancer.create();
        realMovie.play();
    }
    public  static void runHellowService(){
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(HelloService.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        // 创建代理对象
        HelloService proxy= (HelloService)enhancer.create();
        // 通过代理对象调用目标方法
        proxy.sayHello();
    }
}