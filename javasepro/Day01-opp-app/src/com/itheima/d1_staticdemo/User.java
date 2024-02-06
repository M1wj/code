package com.itheima.d1_staticdemo;

public class User {
    public static int number;

    public User()
    {
        //User.number++;
        //在同一个类中访问自己类中的类变量
        number++;
    }
}
