package com.itheima.loof;

public class DoWhileDemo {
    public static void main(String[] args) {
        //目标：掌握do-while循环的书写格式，执行流程，特点和应用场景
        //需求：打印多行helloworld
        int i=0;
        do{
            System.out.println("HelloWorld");
            i++;
        }while (i<3);

        //特点：至少执行一次，先执行后判断
        do{
            System.out.println("HelloWorld2");
        }while(false);

        System.out.println("--------------");

        for(int j=0;j<3;j++)
        {
            System.out.println("Hello World");
        }
        //System.out.println(j);只在for循环中可以使用

        int m=0;
        while (m<3)
        {
            System.out.println("HelloWorld");
            m++;
        }
        System.out.println(m);
    }
}
