package com.itheima.d5_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        //目标：完成秒杀案例
        //1.把开始时间 结束时间 小贾下单时间 小皮下单时间拿到程序中来
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";

        //1.先将日期格式化解析为日期对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt=sdf.parse(start);
        Date endDt=sdf.parse(end);
        Date xjDt=sdf.parse(xj);
        Date xpDt=sdf.parse(xp);

        //2.判断是否秒杀成功 转换成毫秒值进行比较
        long startTime=startDt.getTime();
        long endTime=endDt.getTime();
        long xjTime=xjDt.getTime();
        long xpTime=xpDt.getTime();

        if(xjTime>=startTime&&xjTime<=endTime)
        {
            System.out.println("小贾秒杀成功！");
        }
        else
        {
            System.out.println("小贾秒杀失败");
        }
        if(xpTime>=startTime&&xpTime<=endTime)
        {
            System.out.println("小鹏秒杀成功！");
        }
        else
        {
            System.out.println("小鹏秒杀失败");
        }


    }
}
