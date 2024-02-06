package com.itheima.HomeWork;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数数字");
        int x=sc.nextInt();
        System.out.println("请输入第一个整数数字");
        int y=sc.nextInt();
        System.out.println("请输入第一个整数数字");
        int z=sc.nextInt();
        if(x>=y&&x>=z){
            System.out.println(x);
        }
        else if(y>=x&&y>=z){
            System.out.println(y);
        }
        else if(z>=x&&z>=y)
        {
            System.out.println(z);
        }
    }
}
