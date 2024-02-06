package com.itheima.define;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标：掌握按照方法解决的实际业务需求不同
        //需求：打印三行helloworld
        printfHelloWorld();
        System.out.println("-------------");
        printfHelloWorld();

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要多少行helloworld");
        int sum= sc.nextInt();
        printfHelloworld(sum);

    }
    //有参数无返回值的方法
    public static void printfHelloworld(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World");
        }
    }



    //无参数无返回值的方法
    public static void printfHelloWorld()
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
