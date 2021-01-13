package com.tledu.cn.basic.spring_anno_di_4;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    @Value("加菲猫")
    private String name;
    @Override
    public String fetchName() {
        return name;
    }
}
