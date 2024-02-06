package com.itheima.d2_staticmethod;

public class Student {
    double score;
    //类方法
    public static void printHelloWorld()
    {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //实例方法（对象的方法）
    public void printPass()
    {
        System.out.println(score >= 60 ? "及格" : "不及格");
    }
}
