package com.tledu.cn.basic.spring_di_2.auto_di;

public class Dog {

    private String name="myDog";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
