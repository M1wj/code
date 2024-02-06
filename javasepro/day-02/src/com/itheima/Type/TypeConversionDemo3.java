package com.itheima.Type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        //目标：掌握强制类型转换
        int a=20;
        byte b= (byte) a;//byte b=a;ALT+ENTER强制类型转换
        System.out.println(a);
        System.out.println(b);

        int i=1500;
        byte j= (byte) i;
        System.out.println(j);

        double d=99.5;
        int m= (int) d;
        System.out.println(d);//丢掉小数部分保留整数部分
    }

}
