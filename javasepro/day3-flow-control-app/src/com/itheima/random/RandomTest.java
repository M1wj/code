package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        //猜数游戏
        //1.先随机产生一个1-100之间的数字


        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int lucklynumber=r.nextInt(100)+1;

        //2.产生一个死循环让用户不断地猜测号码
        while(true)
        {
            System.out.println("请输入您猜测的数字");
            int number=sc.nextInt();

            //3.判断用户猜测的数字大小并提示
            if(number>lucklynumber)
            {
                System.out.println("猜大了");
            }
            else if(number<lucklynumber)
            {
                System.out.println("猜小了");
            }

            else
            {
                System.out.println("猜对了");
                break;
            }

        }
    }
}
