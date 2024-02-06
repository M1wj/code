package com.itheima;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //生成验证码
        String code=createCode(5);
        System.out.println(code);
    }

    public static String createCode(int n)
    {
        Random r=new Random();

        //3.定义一个String类型的变量用于记住产生的每位随机字符
        String code="";

        //1.定义一个for循环来不断生成随机数
        for (int i = 1; i <=n ; i++) {
            //2.为每一个位置随机产生一个字符，可能是数字，大写或小写字母
            //思路：随机一个0~2之间的数字：0代表随机一个数字字符，1代表大写字母，2代表小写字母

            int type= r.nextInt(3);// 0 1 2随机一个数字
            switch(type)
            {
                case 0:
                    //随机一个数字字符
                    code+=r.nextInt(10);//0~9的随机字符
                    break;
                case 1:
                    //随机一个大写字母 A 65 Z 90
                    char ch1=(char)(r.nextInt(26)+65);
                    code+=ch1;
                case 2:
                    //随机一个小写字母 a 97 z 97+25
                    char ch2=(char)(r.nextInt(26)+97);
                    code+=ch2;
            }
        }
        return code;
    }
}
