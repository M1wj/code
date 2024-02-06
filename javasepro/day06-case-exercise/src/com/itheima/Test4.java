package com.itheima;

public class Test4 {
    public static void main(String[] args) {
        //数字加密
        System.out.println(encrypt(1983));
    }

    public static String encrypt(int number)
    {
        //1.先把这个密码拆分成一个一个的数字，才可已对其进行加密
        int []numbers=split(number);

        //2.遍历这个数组中的每个元素，对其进行加密处理
        for(int i=0;i<numbers.length;i++){
            numbers[i]=(numbers[i]+5)%10;
        }

        //3.反转数组
        reserve(numbers);

        //4.将加密的数字拼接起来
        String code="";
        for (int i = 0; i < numbers.length; i++) {
            code+=numbers[i];
        }

        return code;

    }

    public static void reserve(int[] numbers) {
        for (int i = 0,j=numbers.length-1; i < j; i++,j--) {
            int temp=numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }
    }

    public static int[] split(int number) {
        int []numbers=new int[4];
        numbers[0]=number/1000%10;
        numbers[1]=number/100%10;
        numbers[2]=number/10%10;
        numbers[3]=number%10;
        return numbers;

    }
}
