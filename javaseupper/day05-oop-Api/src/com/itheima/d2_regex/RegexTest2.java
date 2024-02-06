package com.itheima.d2_regex;

import java.util.Scanner;

/*
*目标：校验用户输入的电话，邮箱，时间是否合法
*/
public class RegexTest2 {
    public static void main(String[] args) {
        checkPhone();
        checkEmail();
        checkTime();
    }

    public static void checkPhone()
    {
        while (true) {
            System.out.println("请输入您的电话号码（手机|座机）：");
            Scanner sc=new Scanner(System.in);
            String phone=sc.nextLine();
            //18676769999 010-34242424 0104644535
            if(phone.matches(("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})"))){
                System.out.println("您输入的号码格式正确");
                break;
            }else {
                System.out.println("您输入的号码不正确");
            }
        }
    }

    public static void checkEmail()
    {
        while (true) {
            System.out.println("请输入您的邮箱：");
            Scanner sc=new Scanner(System.in);
            String email=sc.nextLine();
            /*
            * dlei0009@163.com
            * 25143242@qq.com
            * itheima@itcast.com.cn
            */
            if(email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("您输入的邮箱格式正确");
                break;
            }else {
                System.out.println("您输入的邮箱不正确");
            }
        }
    }

    public static void checkTime()
    {
        while (true) {
            System.out.println("请输入时间格式：");
            Scanner sc=new Scanner(System.in);
            String phone=sc.nextLine();

            if(phone.matches("\\d[0-24]{1,2}:\\d[0-59]{1,2}:\\d[0-59]{1,2}")){
                System.out.println("您输入的号码格式正确");
                break;
            }else {
                System.out.println("您输入的号码不正确");
            }
        }
    }
}

