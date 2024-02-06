package com.itheima.d6_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3_LocalDateTime {
    public static void main(String[] args) {
        //获取本地日期和事件对象
        LocalDateTime ldt=LocalDateTime.now();//年 月 日 时 分 秒 纳秒
        System.out.println(ldt);

        //可以把LocalDateTime转换成LocalDate和LocalTime
        //可以把LocalDate和LocalTime合并成LocalDateTime
        //public LocalDate toLocalDate()
        //public LocalTime toLocalTime()
        //public static LocalDateTime of(LocalDate date,LocalTime time)
        LocalDate ld=ldt.toLocalDate();
        LocalTime lt=ldt.toLocalTime();
        System.out.println(ld);
        System.out.println(lt);

        LocalDateTime ldt10=LocalDateTime.of(ld,lt);

        System.out.println(ldt10);
    }
}
