package com.itheima.pkg.string;

import java.util.Random;

public class stringTest5 {
    public static void main(String[] args) {

        System.out.println(creatcode(4));
        System.out.println(creatcode(6));
    }
    //1.设计一个方法，返回指定位数的验证码
    public static  String creatcode(int n)
    {
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int index= r.nextInt(data.length());
            code+=data.charAt(index);
        }
        return code;
    }
}
