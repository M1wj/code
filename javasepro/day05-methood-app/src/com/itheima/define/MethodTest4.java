package com.itheima.define;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        //案例：求1~n的和
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要求到几");
        int num=sc.nextInt();

        System.out.println("1~" + num + "的和为：" + sumnumber(num));
        jiou(num);
        jiou(sumnumber(num));
    }

    public static void jiou(int number)
    {
        if(number%2==0)
        {
            System.out.println("是偶数");
        }
        else
        {
            System.out.println("是奇数");
        }
    }



    public static int sumnumber(int n)
    {
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        return sum;
    }
}
