package com.itheima.d2_regex;

import java.util.Scanner;

/*
*目标：体验使用正则表达式来检验数据格式的合法性
* 需求：检验QQ号码是否正确，要求全部是数字，长度是（6-20）之间，不能以0开头
*/
public class RegexTest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入qq号码");
        String qq=sc.next();
        System.out.println(checkQQ(qq));
    }

    //正则表达式
    public static boolean checkQQ1(String qq)
    {
        return qq !=null&&qq.matches("[1-9]\\d{5,19}");

    }

    public static boolean checkQQ(String qq)
    {
        //1.判断qq号码是否为null
        if(qq==null ||qq.startsWith("0")|| qq.length()<6||qq.length()>20)
        {
            System.out.println("不合法 号码为空或位数不正确或首位为0");
            return false;
        }

        //2.qq至少不是null 不是以0开头 满足6-20的长度
        //判断qq号码是不是都是数字

        for (int i = 0; i < qq.length(); i++) {
            //根据索引提取当前位置的字符
            char ch=qq.charAt(i);
            //判断ch记住的字符，如果不是数字，qq号码不合法
            if(ch<'0'||ch>'9')
            {
                System.out.println("不合法,不为纯数字");
                return false;
            }
        }
        //qq号码必定合法
        System.out.println("qq号码合法");
        return true;
    }
}
