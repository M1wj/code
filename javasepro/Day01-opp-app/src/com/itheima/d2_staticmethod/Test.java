package com.itheima.d2_staticmethod;

public class Test {
    public static void main(String[] args) {
        //1.类方法的用法
        //类名.类方法（推荐）
        Student.printHelloWorld();

        //对象.类方法（不推荐）
        Student s=new Student();
        s.printHelloWorld();

        //2.实例方法的使用
        //对象.实例方法
        s.score=90;
        s.printPass();
    }

}
