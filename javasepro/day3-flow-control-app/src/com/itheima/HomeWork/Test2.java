package com.itheima.HomeWork;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入您的工龄：");
        int age=sc.nextInt();
        System.out.print("请输入您的基本工资:");
        int money=sc.nextInt();
        if(age>=10&&age<15)
        {
            System.out.println("您目前工作了" + age + "年，基本工资为" + money + "元，应涨工资20000元，涨后工资" + (money + 20000) + "元");
        }
        else if(age>=5&&age<10)
        {
            System.out.println("您目前工作了" + age + "年，基本工资为" + money + "元，应涨工资10000元，涨后工资" + (money + 10000) + "元");
        }
        else if(age>=3&&age<5)
        {
            System.out.println("您目前工作了" + age + "年，基本工资为" + money + "元，应涨工资5000元，涨后工资" + (money + 5000) + "元");
        }
        else if(age>=1&&age<3)
        {
            System.out.println("您目前工作了" + age + "年，基本工资为" + money + "元，应涨工资3000元，涨后工资" + (money + 3000) + "元");
        }
        else{
            System.out.println("您目前工作了" + age + "年，基本工资为" + money + "元，应涨工资0元，涨后工资" + money  + "元");
        }

    }
}
