package com.itheima.define;

import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //目标：掌握动态定义数组
        //数据类型[]数组名=new 数据类型[数组长度];
        int []age=new int[3];//age={0,0,0};
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < age.length; i++) {
            System.out.println("请给数组的第"+(i+1)+"个元素赋值");
            age[i]= sc.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        char[]chars=new char[3];//chars[0 0 0]
        System.out.println((int) chars[0]);

        double[]doubles=new double[3];//0.0 0.0 0.0
        System.out.println(doubles[0]);

        boolean[] booleans=new boolean[3];//false false false
        System.out.println(booleans[0]);

        String [] strings=new String[3];//null null null
        System.out.println(strings[0]);

    }
}
