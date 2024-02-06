package com.itheima.Operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //目标：掌握三元运算符的基本使用 表达式为真取前面的值，为假取后面的值
        double score=90;
        String sr=score>=60 ? "成绩及格":"成绩不及格";
        System.out.println(sr);

        String sr1=score==100 ? "成绩满分":"成绩不满分";
        System.out.println(sr1);

        //需求：找出两个值中的最大值
        int a=99;
        int b=167;
        int max=a>b? a:b;
        System.out.println(max);

        System.out.println(10 > 3 || 10 > 3 && 10 < 3);//&&的优先级高于&&，结果为true
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);
    }
}
