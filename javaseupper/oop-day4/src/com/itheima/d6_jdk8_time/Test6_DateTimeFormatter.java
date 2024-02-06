package com.itheima.d6_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6_DateTimeFormatter {
    public static void main(String[] args) {
        //1.创建一个日期时间格式化器对象出来
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        //2.对时间进行格式化
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);

        String rs=formatter.format(now);//正向格式化
        System.out.println(rs);

        //格式化时间的另一种方法
        String rs2=now.format(formatter);//反向格式化
        System.out.println(rs2);

        //4.解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析
        String dateStr="2029年12月12日 12:12:11";
        LocalDateTime ldt=LocalDateTime.parse(dateStr,formatter);
        System.out.println(ldt);
    }
}
