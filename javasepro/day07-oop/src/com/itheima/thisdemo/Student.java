package com.itheima.thisdemo;

public class Student {
    double score;
    public void printthis()
    {
        System.out.println(this);
    }

    public void printfPass(double score)
    {
        if(this.score>score)
        {
            System.out.println("恭喜您被哈佛录取");

        }
        else
        {
            System.out.println("抱歉您落选了");
        }
    }
}
