package com.tledu.cn.basic.spring_di_2.auto_di;

public class Cat {

    private String name="十三";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
