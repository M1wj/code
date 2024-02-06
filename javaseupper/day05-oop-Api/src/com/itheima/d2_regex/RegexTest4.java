package com.itheima.d2_regex;

import java.util.Arrays;

/*
* 目标：掌握使用正则表达式做搜索替换，内容分割*/
public class RegexTest4 {
    public static void main(String []args){
        //1.public String replaceAll(String regex,String newStr):按照正则表达式匹配的内容进行替换
        //需求1：请把 古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴，中间的非中文字符替换成”-“
        String s1="古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴";
        System.out.println(s1.replaceAll("\\w+", "-"));

        //需求2（拓展）:某语言系统，收到一个口吃的人说的”我我我我喜欢编编编编程！“，需要忧化成我喜欢编程！”
        String s2="我我我我喜欢编编编编程程程";
        /*
        * (.)一组：.匹配任意字符的
        *\\1:为这个组声明一个组好：1号
        * +：声明必须是重复的字
        * $1 可以取到第1组代表的那个重复的字
        * */
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));

        //2.public Stringp[]split (String regex):按照正则表达式匹配的内容进行分割字符串 返回一个字符串数组
        //需求1：请把 古力娜扎ai88888迪丽热巴999aa5566马儿扎哈fbbfsfs42425卡尔扎巴,中的人名获取出来
        String s3="古力娜扎ai88888迪丽热巴999aa5566马儿扎哈fbbfsfs42425卡尔扎巴";
        String []names=s3.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}
