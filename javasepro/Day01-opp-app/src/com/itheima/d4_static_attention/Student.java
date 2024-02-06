package com.itheima.d4_static_attention;

public class Student {
    static String schoolName;//类变量
    double score;//实例变量

    //1，类方法中可以直接访问类的成员，不可以直接访问实例成员
    public static void printHelloWorld()
    {
        //同一个类中访问类成员可以省略类名不写
        schoolName="黑马";
        printHelloWorld2();

//        System.out.println(score);//报错
//        printPass();//报错
       // System.out.println(this);//报错
    }

    //类方法
    private static void printHelloWorld2() {
    }

    //2、实例方法中既可以直接访问类成员，也可以直接访问实例成员。
    //实例方法
    public void printPass() {
        schoolName="黑马2";
        printHelloWorld2();
        System.out.println(score);
        printPass2();
        System.out.println(this);
    }

    //实例方法
    public void printPass2()
    {

    }
}
