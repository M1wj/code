package com.itheima.System_method;

public class SystemTest {
    public static void main(String[] args) {
        //目标：了解System类的常见方法
        //1.public static void exit(int status):
        //终止当前运行的Java虚拟机
        //该参数用作状态代码 按照惯例，非零状态代码表示异常终止
        //System.exit(0)//人为的终止虚拟机（不要使用）

        //2.public static long currentTimeMillis();
        //获取当前系统的时间
        //返回的long类型的时间毫秒值：指的是从1970-1-1 0：0：0开始走到此刻的总毫秒值 1s=1000ms

        //可用来测试代码性能
        long time=System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }

        long time2=System.currentTimeMillis();
        System.out.println((time2-time)/1000.0+"s");

    }
}
