package com.itheima.Operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标：掌握逻辑运算符的使用
        //需求：要求手机尺寸必须大于等于6.95，且内存必须大于等于8
        double size=6.8;
        int storage=16;
        boolean rs=size>=6.95&storage>=8;//多个条件都为true才为true
        System.out.println(rs);

        boolean rs1=size>=6.95|storage>=8;//多个条件有一个为true就为true
        System.out.println(rs1);

        //取反运算符！ 你真我假 你假我真
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2 > 3));

        //^前后条件相同返回false，不同返回true
        System.out.println(true ^ true);
        System.out.println(false^false );
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        //&& 和 ||
        int i=20;
        int j=40;
        System.out.println(i > 100 && ++j > 99);//左边为false时右边不执行，结果与&相同
        System.out.println(j);
        System.out.println(i > 100 & ++j > 99);
        System.out.println(j);

        int m=10;
        int n=30;
        System.out.println(m > 3 || ++n > 40);//左边为true时右边不执行，结果与|相同
        System.out.println(n);
        System.out.println(m > 3 | ++n > 40);
        System.out.println(n);
    }
}
