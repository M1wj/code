package com.itheima.d9_modifer;

public class Demo {
    public static void main(String[] args) {
        //目标：掌握不同权限修饰符的作用
        Fu f=new Fu();
//        f.privateMethod();//报错
        f.method();
        f.publicMethod();
        f.protectedMethod();
    }
}
