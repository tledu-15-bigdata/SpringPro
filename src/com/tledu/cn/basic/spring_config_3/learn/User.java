package com.tledu.cn.basic.spring_config_3.learn;

public class User {
    private String userName;
    private String password;
    private String url;

    public void sayHello() {
        System.out.println("User sayHello...");
    }

    public void start() {
        System.out.println("User 初始化...");
    }

    public void cleanUp() {
        System.out.println("User 销毁...");
    }
}