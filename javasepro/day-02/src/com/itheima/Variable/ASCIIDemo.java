package com.itheima.Variable;

public class ASCIIDemo {
//    目标：掌握ASCII编码表
public static void main(String[] args) {
    System.out.println('a'+10);//97+10=107
    System.out.println('A'+10);//65+10=75
    System.out.println('0'+10);//48+10=58

    //二进制，八进制，十六进制再程序中的写法
    int a1=0b01100001;//二进制以0b或0B开头
    System.out.println(a1);

    int a2=0141;//八进制以0开头
    System.out.println(a2);

    int a3=0XFA;//二进制以0x或0X开头
    System.out.println(a3);
}
}
