package com.tledu.cn.basic.spring_bean_1.domain;

/**
 * @ClassName Student
 * @Description TODO
 * @Author YouLi
 * @Date 2018/4/15 23:16
 **/
/**
* @author YouLi
* @Description
 * 1、JavaBean
 *   pojo对象--servlet（JSP）：JavaBean--Bean
 *bean
 *   1、属性
 *   2、封装（getter和setter）
 *   3、无参构造方法
* @Date 2018/4/15 23:17
*/
public class Student {
    private String name="张三";
    private int age=20;

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

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public Student() {
        System.out.println("我是学生！！");
    }
}
