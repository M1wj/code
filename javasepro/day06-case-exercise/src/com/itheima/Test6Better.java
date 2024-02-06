package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test6Better {
    public static void main(String[] args) {
        //抢红包
        int []moneys={9,666,188,520,99999};
        money(moneys);
    }

    public static void money(int []moneys)
    {
        //先将红包金额随机打乱
        daluan(moneys);

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < moneys.length; i++) {
            System.out.println("请输入任意内容");
            sc.next();
            System.out.println("恭喜您抽奖成功！金额为:" + moneys[i]);
            if(i==moneys.length-1)
            {
                System.out.println("活动结束");
            }
        }
    }

    private static void daluan(int[] moneys) {
        Random r=new Random();
        for (int i = 0; i < moneys.length; i++) {
            int index=r.nextInt(moneys.length);
            int temp=moneys[i];
            moneys[i]=moneys[index];
            moneys[index]=temp;
        }
    }
}
