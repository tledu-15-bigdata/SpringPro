package com.tledu.cn.proxy.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//Proxy  代理
/*解决静态代理无法通用
*
* JDK动态
* 1、自定义代理类  实现InvocationHandler接口
*
*
*
* */
public class JdkProxy implements InvocationHandler {
    private Object target ;//需要代理的目标对象


    /*实现代理类必须重写的invoke方法*/
    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {
        System.out.println("JDK动态代理，监听开始！");//额外功能A
//        主营业务方法
        Object result = method.invoke(target, args);//主营业务功能
        System.out.println("JDK动态代理，监听结束！");//额外功能B
        System.out.println("-=-=-=-=-=-=-=-=--=-=-=");
        return result;
    }





    //JDK动态代理只能针对实现了接口的类进行代理，newProxyInstance 函数所需参数就可看出
    /*参数说明
     *
     *ClassLoader loader：被代理对象的类加载器
     *Class<?>[] interfaces：被代理对象的接口
     *InvocationHandler h：代理类对象
     *
     *
     * */
    //定义获取代理对象方法
    public Object getJDKProxy(Object targetObject){
        //为目标对象target赋值
        this.target = targetObject;
        return Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);
    }







}