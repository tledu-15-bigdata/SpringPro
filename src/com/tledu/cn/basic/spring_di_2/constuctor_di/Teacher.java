package com.tledu.cn.basic.spring_di_2.constuctor_di;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author YouLi
 * @Date 2018/4/16 20:51
 **/
@Component(value="teacher")
public class Teacher {
    private String name;
    private String address;
    private String phone;
//养狗
//    @Autowired
    private Dog dog;
    private List<String> schools;

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Teacher() {
        System.out.println("你好，我是老师");
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", phone='" + phone + '\'' + ", dog=" + dog + ", schools=" + schools + '}';
    }
}
