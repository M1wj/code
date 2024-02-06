package com.itheima.HomeWork;

public class Test5 {
    public static void main(String[] args) {
        int cout=0;
        for(int i=1000;i<=9999;i++)
        {
            int geiwei=i%10;
            int shiwei=i/10%10;
            int baiwei=i/100%10;
            int qianwei=i/1000%10;
            if(geiwei+qianwei==baiwei+shiwei)
            {
                System.out.println(i);
                cout++;
            }

        }
        System.out.println("以上满足条件的四位数总共有" + cout + "个");
    }
}
