package com.itheima.pkg.HomeWork;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        str=myToUpperCase(str);
        System.out.println("转换后(小转大）"+str);
        str=myToLowerCase(str);
        System.out.println("转换后(大转小）"+str);

    }

    private static String myToUpperCase(String str) {
        String s="";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                s+=(char)((int)str.charAt(i)-32);
                continue;
            }
            s+=str.charAt(i);
        }
        return s;
    }

    private static String myToLowerCase(String str) {
        String s="";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                s+=(char)((int)str.charAt(i)+32);
                continue;
            }
            s+=str.charAt(i);
        }
        return s;
    }
}
