package com.itheima.d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String data="a我b";
        byte [] bytes =data.getBytes();//默认按照平台字符集（UTF-8）进行编码
        System.out.println(Arrays.toString(bytes));

        //按照指定字符集进行编码
        byte [] bytes1=data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //2.解码
        String s1=new String(bytes);//按照平台默认编码（UTF-8）解码
        System.out.println(s1);

        String s2=new String(bytes1,"GBK");
        System.out.println(s2);
    }
}
