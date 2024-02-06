package com.itheima.d3_util;

import java.util.Random;

public class MyUtil {
    //私有构造器，防止他人创造对象
    private MyUtil()
    {

    }
    public static String createCode(int n)
    {
        String code="";
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r=new Random();
        for(int i=0;i<n;i++)
        {
            int index=r.nextInt(data.length());
            code+=data.charAt(index);
        }
        System.out.println(code);
        return code;
    }
}
