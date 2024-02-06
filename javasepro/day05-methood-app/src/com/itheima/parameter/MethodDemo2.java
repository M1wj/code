package com.itheima.parameter;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标：引用类型的参数传递
        int []arr={11,22,33};
        arr(arr);
        System.out.println(arr[1]);

    }
    public static void arr(int[]args)
    {
        System.out.println(args[1]);
        args[1]=222;
        System.out.println(args[1]);
    }
}
