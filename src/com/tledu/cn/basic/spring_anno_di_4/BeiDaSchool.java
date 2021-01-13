package com.tledu.cn.basic.spring_anno_di_4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//默认单例的
@Scope("prototype") //BDSchool
public class BeiDaSchool implements School{
    @Value("北大")
    private String name;


    @Override
    public String fetchName() {
        return name;
    }



}
