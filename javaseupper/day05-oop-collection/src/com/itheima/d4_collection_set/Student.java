package com.itheima.d4_collection_set;

import java.util.Objects;
//1.让自定义的类（如学生类）实现Comparable接口
// 重写里面的compareTo方法来指定比较规则
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    //this o
    @Override
    public int compareTo(Student o) {
        //左边 > 右边 返回正整数
        //左边 < 右边 返回负整数
        //左边 = 右边 返回0
        //需求按照年龄升序排序
        return this.age-o.age;
    }

    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    //重写hashCode（）和 equals（）方法

    //只要两个对象内容一样就返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.height, height) == 0 && Objects.equals(name, student.name);
    }

    //只要两个对象哈希值一样就返回true
    @Override
    public int hashCode() {
        //通过年龄姓名身高返回哈希值
        return Objects.hash(name, age, height);
    }
}
