package com.itheima.d13_stringbuilder;

public class Test2 {

    public static void main(String[] args) {
        //目标：掌握StringBuilder的好处
        //需求：拼接100万次abc
        //先用String测试看看性能
//        String rs="";
//        for (int i = 1; i <=10000000 ; i++) {
//            rs=rs+"abc";
//        }
//        System.out.println(rs);

        //使用StringBuilder性能好，其对字符串的处理非常快
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <=1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
