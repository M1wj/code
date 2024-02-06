package com.itheima.pkg.string;

public class StringDemo3 {
    public static void main(String[] args) {
        //目标:搞清楚String 使用时的几个注意事项
        //1.String的对象是不可变的
        String name="黑马";
        name+="程序员";//name=name+"程序员“
        name+="播妞";
        System.out.println(name);

        String name1="abc";
        String name2="abc";
        System.out.println(name1 == name2);//比较字符串变量中存放的地址是否一样

        char[]chars={'a','b','c'};
        String s1=new String(chars);
        String s2=new String(chars);
        System.out.println(s1 == s2);//比较地址是否相同

        String a1="abc";
        String a2="a"+"b"+"c";
        System.out.println(a1 == a2);

        String a3="ab";
        String a4=a3+"c";
        System.out.println(a4==a1);
    }
}
