package com.itheima.d6_jdk8_time;

import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.LocalDateTime;

public class Test8_Duration {
    public static void main(String[] args) {
        LocalDateTime start=LocalDateTime.of(2025,11,11,11,10,10);
        LocalDateTime end=LocalDateTime.of(2026,11,11,11,10,10);

        //1.得到Duration对象
        Duration duration=Duration.between(start,end);

        //获取两个事件对象间隔的信息
        System.out.println(duration.toDays());
        System.out.println(duration.toMillis());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toNanos());
    }
}
