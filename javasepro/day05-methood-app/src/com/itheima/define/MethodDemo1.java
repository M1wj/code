package com.itheima.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：掌握定义方法的完整格式，搞清楚使用方法的好处
        //需求：假如现在很多程序员都要进行2个整数求和的操作

        //1.李工
        int arr=sum(10,20);
        System.out.println(arr);

        //王工
        int arr1=sum(29,31);
        System.out.println(arr1);


    }
    public static  int sum(int a,int b)
    {
        int sum=a+b;
        return sum;

    }
}
