package com.itheima.d5_block;

public class Student {
    static int number=80;
    static String schoolName;

    //静态代码块
    static{
        System.out.println("代码块被执行了");
        schoolName="黑马";
    }

    //实例代码块
    //创建对象时执行实例代码块，在构造器前执行
    {
        System.out.println("实例代码快执行了");
        System.out.println("有人创建了对象" + this);
    }
    public Student()
    {
        System.out.println("无参构造器被执行");
    }
    public Student(String name){
        System.out.println("有参构造器被执行");
    }
}
