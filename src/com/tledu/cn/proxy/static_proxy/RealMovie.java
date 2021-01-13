package com.tledu.cn.proxy.static_proxy;

//主营业务  播放电影
public class RealMovie implements Movie {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("您正在观看电影 《肖申克的救赎》");
    }

}