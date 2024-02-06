package com.itheima;

public class Test5 {
    public static void main(String[] args) {
        //拷贝数组案例
        int []arr1={11,22,33};
        int []arr2=copy(arr1);

        printArray(arr2);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    public static int [] copy(int []arr)
    {
        //1.创建一个长度相同的整型数组
        int []arr2=new int[arr.length];

        //2.为新数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }

        return arr2;

    }
}
