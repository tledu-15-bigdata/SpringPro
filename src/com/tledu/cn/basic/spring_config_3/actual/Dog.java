package com.tledu.cn.basic.spring_config_3.actual;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name="萨摩耶";

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
