package com.itheima.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //多个变量指向同一个数组
        int []arr={1,2,3};
        int []arr1=arr;
        System.out.println(arr);
        System.out.println(arr1);

        arr1[1]=5;
        System.out.println(arr1[1]);
        System.out.println(arr[1]);

        arr=null;
        //System.out.println(arr[1]); 为空时该变量不在指向任何数组对象
       // System.out.println(arr.length); 为空时该变量不在指向任何数组对象
    }
}
