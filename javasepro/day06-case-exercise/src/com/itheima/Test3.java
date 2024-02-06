package com.itheima;

import java.util.Scanner;

public class Test3 {
    //评委打分案例
    public static void main(String[] args) {
        System.out.println(getAverageScore(6));

    }

    public  static double getAverageScore(int number)
    {
        //1.定义一个动态初始化数组，负责后期存入评委的评分
        double []scores=new double[number];

        //2.遍历数组的每个位置，日次录入评委评分
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您录入第" + (i + 1) + "个评委录入分数：");
            double score=sc.nextDouble();
            scores[i]=score;
        }

        //3.在数组中找总分，最高分，最低分
        double sum=0;
        double max=scores[0];
        double min=scores[0];

        //通过一次遍历找到所有值
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];

            if(max<scores[i])
            {
                max=scores[i];
            }
            if(min>scores[i])
            {
                min=scores[i];
            }
        }

        return 1.0*(sum-max-min)/(number-2);
    }
}
