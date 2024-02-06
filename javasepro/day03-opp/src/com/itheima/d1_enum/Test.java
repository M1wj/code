package com.itheima.d1_enum;

public class Test {
    public static void main(String[] args) {
        //目标：认识枚举
        A a1=A.X;
        System.out.println(a1);

        //1、枚举的构造器是私有的，不能对外创建对象
        //A a=new A();

        //2、枚举的第一行都是常量，记住的是枚举类的对象
        A a2=A.Y;

        //3、枚举类提供一个一些额外的API
        A[] as=A.values();//拿到全部对象
        A a3=A.valueOf("Z");
        System.out.println(a3.name());//Z
        System.out.println(a3.ordinal());//索引

        System.out.println("---------");
        B y=B.Y;
        y.go();
    }
}
