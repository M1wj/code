package com.itheima.branch;

import java.util.Scanner;

public class IFDemo1 {
    public static void main(String[] args) {
        //目标：需要掌握if分支的三种形式的用法和执行流程
        //需求：测试用户体温温度若超过37就报警
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入用户的体温：");
        double t=sc.nextDouble();
        if(t>37)
        {
            System.out.println("这个人的温度异常请隔离!");
        }

        //需求2：发红包，钱包余额99元，现在要发出98元
        //如果钱够触发发红包的动作，如果钱不够，提示余额不足
        System.out.println("请输入要发出红包的金额：");
        double money=sc.nextDouble();
        if(money<=90)
            System.out.println("红包发送成功！");
        else
            System.out.println("余额不足!");

        //需求3：某个公司有一个绩效系统，根据员工的打分输入对应的绩效级别。[0,60) D [60,80) C [80,90) B [90,100] A
        System.out.println("请输入您的成绩：");
        double score= sc.nextDouble();
        if(score>=0&&score<60)
            System.out.println("D");
        else if(score>=60&&score<80)
            System.out.println("C");
        else if(score>=80&&score<90)
            System.out.println("B");
        else if(score>=90&&score<=100)
            System.out.println("A");
        else
            System.out.println("您输入的成绩有误！");

    }
}
