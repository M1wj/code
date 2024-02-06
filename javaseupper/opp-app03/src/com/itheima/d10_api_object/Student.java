package com.itheima.d10_api_object;

import java.util.Objects;

public class Student {//extends Object默认继承Object类
    private String name;
    private int age;

    //重写equals方法对象的内容一样就返回true
    //比较者s2==this
    //被比较者 s1==o


    @Override
    public boolean equals(Object o) {
        //1.判断两个对象是否地址一样，一样直接返回true
        if (this == o) return true;
        //2.判断o是null直接返回false，或者比较者和被比较者的类型不一样也直接返回false
        if (o == null || /*this.可以省略*/getClass() != o.getClass()) return false;
        //3.o不是null，且o与当前比较者类型一样，开始比较新内容
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(this.name, student.name);
    }



    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
