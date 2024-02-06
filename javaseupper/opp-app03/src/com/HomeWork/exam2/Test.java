package com.HomeWork.exam2;

public class Test {
    public static void main(String[] args) {
        Integer i = 100;
        Integer i2 = 100;
        System.out.println(i == i2);//127以前地址一样不用new
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4);//127以后要new一个对象
    }
}
