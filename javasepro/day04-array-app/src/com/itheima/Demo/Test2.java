package com.itheima.Demo;

public class Test2 {
    public static void main(String[] args) {
        //目标：反转数组
        int []ar={10,20,30,40,50};

        for (int i = 0, j=ar.length-1; i<j; i++,j--) {
            int t=ar[j];
            ar[j]=ar[i];
            ar[i]=t;
            
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
