package com.itheima.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        //案例打分系统输入六名评委的打分录完后输入平均分作为选手得分
        double []scores=new double[6];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "名评委的分数");
            scores[i]=sc.nextDouble();
            sum+=scores[i];
        }

        double arrayscores=sum/6.0;
        System.out.println("平均分数为：" + arrayscores);
    }

}
