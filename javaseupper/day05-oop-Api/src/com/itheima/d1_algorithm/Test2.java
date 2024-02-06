package com.itheima.d1_algorithm;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //目标：掌握选择排序
        int []arr={5,1,3,2};

        for(int i=0;i<arr.length-1;i++){
            //i=0 第一轮 j=1 2 3
            //i=1 第一轮 j=2 3
            //i=2 第一轮 j=3
            //
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
