package com.tledu.cn.basic.spring_di_2.constuctor_di;

import org.springframework.stereotype.Component;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author YouLi
 * @Date 2018/4/16 21:02
 **/
@Component
public class Dog {
    private String name="萨摩耶";
    private int age=6;
    private String color="白色";



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + ", color='" + color + '\'' + '}';
    }
}
