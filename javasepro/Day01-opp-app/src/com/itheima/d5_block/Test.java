package com.itheima.d5_block;

public class Test {
    public static void main(String[] args) {
        //认识代码块，了解他们的特点和基本作用
        //类加载时执行且只执行一次
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);

        System.out.println(Student.schoolName);
        System.out.println("---------------------");

        Student s1=new Student();
        Student s2=new Student("asdfsaf");
    }
}
