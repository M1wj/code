package com.itheima.d6_jdk8_time;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //传统时间类（Date SimpleDateFormat Calender)存在如下问题：
        //1.设计不合理 使用不方便 很多都被淘汰了
        Date d=new Date();
        //System.out.println(d.getYear() + 1990);

        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        System.out.println(year);

         //2.都是可变对象 修改后会失去最开始的时间信息

        //3.线程不安全

        //4.不能精确到纳秒 只能精确到毫秒
        //1秒=1000毫秒
        //1毫秒=1000微妙
        //1微妙=1000纳秒
    }
}
