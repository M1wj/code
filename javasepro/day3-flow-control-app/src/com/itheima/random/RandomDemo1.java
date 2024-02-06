package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：掌握使用Random产生随机数的步骤
        //1，导包
        //2.创建一个Random类
        Random r=new Random();
        //3.调用Random提供的功能，nextInt得到随机数
        for (int i=1;i<=40;i++) {//选中代码后 ALT+CTRAL+T 可以快速调出循环
            int data=r.nextInt(10);//产生0~9的随机数包前不包后
            System.out.println(data);
        }

        System.out.println("----------------");
        //生成:1-10之间的随机数
        // 1/ 1-10 =>-1 =>(0 - 9) + 1
        for (int i=1;i<=40;i++) {//选中代码后 ALT+CTRAL+T 可以快速调出循环
            int data2=r.nextInt(10)+1;//产生1~10的随机数包前不包后
            System.out.println(data2);
        }

        System.out.println("---------------");
        //3 - 17 => -3 =>(0 - 14) +3
        for (int i=1;i<=40;i++) {//选中代码后 ALT+CTRAL+T 可以快速调出循环
            int data3=r.nextInt(15)+3;//产生3~17的随机数包前不包后
            System.out.println(data3);
        }


    }
}
