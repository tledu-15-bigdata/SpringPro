package com.tledu.cn.basic.spring_di_2.auto_di;

public class Teacher {

    private Dog dog;
    private Cat cat;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat2(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
