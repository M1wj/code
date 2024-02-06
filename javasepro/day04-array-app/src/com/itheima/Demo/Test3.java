package com.itheima.Demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //案例：随机排名
        Scanner sc=new Scanner(System.in);
        int []score=new int [6];
        System.out.println(score.length);
        for(int i=0;i< score.length;i++)
        {
            System.out.println("请输入工号：");
            score[i]=sc.nextInt();
        }
        Random r=new Random();

        for(int i=0;i< score.length;i++)
        {
            int index=r.nextInt(score.length);
            int temp=score[index];
            score[index]=score[i];
            score[i]=temp;
        }

        for (int i = 0; i < score.length; i++) {
            System.out.print( score[i]+" ");
        }

    }
}
