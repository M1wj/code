package com.itheima.math_method;

public class MathTest {
    public static void main(String[] args) {
        //目标：掌握math类提供的常见方法
        //1.取绝对值
        System.out.println(Math.abs(3.13));
        System.out.println(Math.abs(-3));

        //2.向上取整
        System.out.println(Math.ceil(3.01));

        //3.向下取整
        System.out.println(Math.floor(3.88888));

        //4.四舍五入
        System.out.println(Math.round(3.4999));
        System.out.println(Math.round(3.5001));

        //5.取较大值和取较小值
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        //6.取次方
        System.out.println(Math.pow(2, 3));//2的三次方 8.0 返回为小数值
        System.out.println(Math.pow(3, 2));

        //7.取随机数 0.0~1.0 包前不包后
        System.out.println(Math.random());
    }
}
