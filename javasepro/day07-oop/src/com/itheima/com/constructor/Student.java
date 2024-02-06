package com.itheima.com.constructor;

public class Student {
    String name;
    double score;

    //构造器，无返回值，与类名相同的一个特殊的方法，也可以重载

    //无参数构造器
    public Student()
    {
        System.out.println("无参数构造器被触发了");
    }

    //有参数构造器
    public Student(String name,double score)
    {
        System.out.println("有参数构造器被触发了");
        this.name=name;
        this.score=score;
    }
}
