package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //抢红包案例
        int []moneys={9,666,188,520,99999};
        start(moneys);
    }

    public static void start(int []moneys)
    {
        //moneys =[9, 666,188,520,99999];
        //          0  1    2   3   4
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        //1.定义一个for循环,控制抽奖五次
        for (int i = 1; i <=5 ; i++) {
            System.out.println("请您输入任意内容进行抽奖:");
            sc.next();//等待用户输入内容，按了回车才往下走

            //3.为当前的粉丝找一个随机的红包出来
            while(true)
            {
                int index=r.nextInt(moneys.length);
                int money=moneys[index];

                //4.判断这个红包不为0
                if(money!=0)
                {
                    System.out.println("恭喜您成功抽取红包：" + money);
                    moneys[index]=0;
                    break;//结束此次抽奖
                }
            }
        }
        System.out.println("活动结束");

    }
}
