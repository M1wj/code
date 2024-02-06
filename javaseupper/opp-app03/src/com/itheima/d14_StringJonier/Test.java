package com.itheima.d14_StringJonier;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        //目的：掌握StringJonier的使用
        //StringJoiner s=new StringJoiner(",");//间隔符
        StringJoiner s=new StringJoiner(",","[","]");//间隔符 开始符号 结束符号
        s.add("java1");//必须添加字符串类型
        s.add("java2");
        s.add("java3");
        System.out.println(s);
    }
    public static String getArrayData(int []arr)
    {
        //判断是否为空
        if(arr==null)
            return null;

        StringJoiner sb=new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sb.add(arr[i]+"");
        }

        return sb.toString();


    }
}
