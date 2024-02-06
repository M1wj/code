package com.itheima.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        //目的：掌握有无static修饰成员变量的用法
        //1.类变量的用法
        //类名。类变量
        System.out.println(Student.name = "袁华");

        //对象.类变量（不推荐)
        Student s1=new Student();
        System.out.println(s1.name);//袁华
        s1.name="马冬梅";
        System.out.println(s1.name);//马冬梅

        Student s2=new Student();
        System.out.println(s2.name);//马冬梅

        //2.实例对象的用法
        s1.age=23;
        s2.age=28;
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}
