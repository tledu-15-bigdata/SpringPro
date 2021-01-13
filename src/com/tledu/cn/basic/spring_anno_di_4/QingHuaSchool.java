package com.tledu.cn.basic.spring_anno_di_4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QingHuaSchool implements School{
    @Value("清华")
    private String name;

    @Override
    public String toString() {
        return "QHSchool{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String fetchName() {
        return name;
    }
}
