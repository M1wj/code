package com.itheima.pkg.HomeWork;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        sfdc(str);
    }

    public static void sfdc(String str)
    {
        for (int i = 0,j=str.length()-1; i < j; i++,j--) {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println("这个字符串不是对称字符串");
                return;
            }
        }
        System.out.println("这个字符串时对称字符串");
    }
}
