package com.itheima.branch;

import java.util.Scanner;


public class SwitchDemo4 {
    public static void main(String[] args) {
        //理解switch的穿透作用

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询的时间：");
        String time=sc.next();
        switch (time){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":

            case "周三":

            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":

            case "周日":
                System.out.println("郁郁寡欢、准备上班。");
                break;
            default:
                System.out.println("您输入的时间有问题");
        }


    }
}
