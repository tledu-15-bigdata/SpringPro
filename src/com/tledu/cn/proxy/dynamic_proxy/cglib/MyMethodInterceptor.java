package com.tledu.cn.proxy.dynamic_proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//代理类
public class MyMethodInterceptor implements MethodInterceptor {
 
    /**
     * sub：cglib生成的代理对象
     * method：被代理对象方法
     * objects：方法入参
     * methodProxy: 代理方法
     */
    @Override
    public Object intercept(Object sub,
                            Method method,
                            Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("======插入前置通知======");//额外业务A
        Object object = methodProxy.invokeSuper(sub, objects);//主营业务执行
        System.out.println("======插入后者通知======");//额外业务B
        return object;
    }
}