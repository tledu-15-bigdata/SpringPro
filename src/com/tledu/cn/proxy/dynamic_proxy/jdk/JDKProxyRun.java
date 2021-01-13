package com.tledu.cn.proxy.dynamic_proxy.jdk;

import com.tledu.cn.proxy.static_proxy.Movie;
import com.tledu.cn.proxy.static_proxy.RealMovie;

public class JDKProxyRun {

    public static void main(String[] args) {
//            runUserManager();
            runMovie();
    }

    public static void runUserManager(){
            JdkProxy jdkProxy = new JdkProxy();//实例化JDKProxy对象
            UserManager user = (UserManager) jdkProxy.getJDKProxy(new UserManagerImpl());//获取代理对象
            user.addUser("admin", "123123");//执行新增方法
            user.delUser("ssss");
    }
    public static void runMovie(){
        JdkProxy jdkProxy=new JdkProxy();
        Movie m = (Movie) jdkProxy.getJDKProxy(new RealMovie());
        m.play();

    }
}
