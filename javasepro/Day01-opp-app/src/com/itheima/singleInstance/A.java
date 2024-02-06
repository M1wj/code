package com.itheima.singleInstance;

public class A {
    //2.定义一个类变量记住类的一个对象
    private static A a=new A();

    //1.必须私有构造器
    private A(){

    }

    //3.定义一个类方法返回类的对象
    public static A getobject(){
        return a;
    }
}
