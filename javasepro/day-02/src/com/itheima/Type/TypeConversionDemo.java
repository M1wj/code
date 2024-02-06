package com.itheima.Type;

public class TypeConversionDemo {
    public static void main(String[] args) {
        //目标：理解自动类型转换机制
        byte a=12;
        int b=a;
        System.out.println(a);
        System.out.println(b);

        int c=100;
        double d=c;
        System.out.println(d);

        char ch='a';
        int i=ch;
        System.out.println(i);
    }
}
