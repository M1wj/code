package com.itheima.pkg.HomeWork;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        int yw=0;
        int sz=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                yw++;
            }
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                sz++;
            }
        }
        System.out.println(str + "中字母：" + yw + "个，数字：" + sz + "个");
    }
}
