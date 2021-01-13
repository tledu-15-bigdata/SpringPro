package com.tledu.cn.basic.spring_anno_di_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//注解方式 被Spring接管  Component
//myStudent   设定 id名称

//名称标注方式：
/*
    1、id设定：@Component("id名称")
    2、@Component
          直接将类名 -->首字母小写-->然后以类名作为id名称

 */


@Component
public class Student {
    @Value("藏三")
    private String name;
    @Value("20")
    private int age;


 /*@Autowired 自动注入  ByType实现*/
    @Autowired
    /*筛选*/
    @Qualifier("qingHuaSchool")//在同种类型的多个bean对象中按照类名进行筛选，
    // 注意和Resource进行区分
    private School school;

//    @Resource  实现注入：以autowired 自动注入ByName实现，

 /*引用对象
 * Resource(name="被注入的对象的ID名称"):自动注入。利用ByName实现
 * */
    @Resource(name="cat")
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                ", pet=" + pet +
                '}';
    }
}
