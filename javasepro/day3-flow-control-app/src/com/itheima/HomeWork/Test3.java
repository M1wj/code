package com.itheima.HomeWork;

public class Test3 {
    public static void main(String[] args) {
        int max=0;
        for(int i=1;i<=100;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                max+=i;
            }
        }
        System.out.println(max);
    }
}
