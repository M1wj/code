package com.itheima.loof;

public class LoopNestedDemo {
    public static void main(String[] args) {
        //目标：搞清楚循环嵌套的执行流程
        //场景：假如你有老婆，你犯错了，你老婆罚你说：3天，每天5句我爱你
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("我爱你" + i);
            }
        }
        System.out.println("----------------");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=4;j++) {
                System.out.print("*");//去掉ln表示不换行
            }
            System.out.println();
        }

    }
}
