package com.itheima.d6_jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test4_ZoneId_ZonedDateTime {
    public static void main(String[] args) {
        //目标：1.ZoneId的常见方法：
        //public static ZoneId systemDefault():获取系统默认的时区
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        //public static Set<String> getAvailableZoneIds():获取java支持的全部时区Id
        System.out.println(ZoneId.getAvailableZoneIds());

        //public static ZoneId of（String zoneId）：把某个时区id封装成ZoneId对象
        ZoneId zoneId1=ZoneId.of("America/New_York");

        //2.ZonedDateTime：带时区的时间
        //public static ZonedDateTime now（ZoneId zone）：获取某个时区的ZonedDateTime对象
        ZonedDateTime now=ZonedDateTime.now(zoneId1);
        System.out.println(now);

        //世界标准时间
        ZonedDateTime now1=ZonedDateTime.now(Clock.systemUTC());//时间标准时间钟
        System.out.println(now1);

        //public static ZonedDateTime now（）：获取系统默认时区的ZonedDateTime对象
        ZonedDateTime now2=ZonedDateTime.now();
        System.out.println(now2);
    }
}
