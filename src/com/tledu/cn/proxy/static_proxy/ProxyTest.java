package com.tledu.cn.proxy.static_proxy;

public class ProxyTest {

    public static void main(String[] args) {

        RealMovie realmovie = new RealMovie();

//        直接调用主营业务
//        realmovie.play();

        Movie movie = new Cinema(realmovie);

        movie.play();

    }

}