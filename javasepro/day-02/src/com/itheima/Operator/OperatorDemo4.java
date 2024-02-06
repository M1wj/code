package com.itheima.Operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标：掌握基本关系运算符的使用
        int a=10;
        int b=5;
        boolean rs=a>b;
        System.out.println(rs);
        System.out.println(a >= b);
        System.out.println(2 >= 2);
        System.out.println(a<b);
        System.out.println(a <= b);
        System.out.println(2 <= 2);
        System.out.println(a == b);
        System.out.println(5 == 5);
        System.out.println(a = b);//先将b的值赋给a，然后再打印出他的值
        System.out.println(a != b);
        System.out.println(10 != 10);

    }
}
