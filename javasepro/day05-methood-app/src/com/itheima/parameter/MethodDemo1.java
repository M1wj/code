package com.itheima.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：理解方法的参数传递机制：值传递
        int a=10;
        change(a);
        System.out.println(a);
    }

    public static void change(int a)
    {
        System.out.println(a);
        a=20;
        System.out.println(a);
    }
}
