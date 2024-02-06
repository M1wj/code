package com.itheima.d1_algorithm;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //目标：掌握冒泡排序的编写
        //1.准备一个数组
        int []arr={5,2,3,1};
        
        //2.定义一个循环控制排几轮
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
