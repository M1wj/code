package com.itheima.HomeWork;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于100的数字");
        int number=sc.nextInt();
        int cout=0;
        int max=0;
        for(int i=100;i<=number;i++){
            if(i%10!=7&&i/10%10!=5&&i/100%10!=3)
            {
                max+=i;
                cout++;

            }
        }
        System.out.println(max);
        System.out.println(cout);
    }
}
