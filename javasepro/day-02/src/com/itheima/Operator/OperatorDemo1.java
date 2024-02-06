package com.itheima.Operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标：掌握基本运算符的使用
        int a=10;
        int b=2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  //5
        System.out.println(5 / 2);//2 在java中两个整数相除的结果任然为整数
        System.out.println(5.0 / 2);//2.5

        int i=5;
        int j=2;
        System.out.println(i / j);//2
        System.out.println(1.0 * i / j);//2.5

        System.out.println(a % b);//0
        System.out.println(3 % 2);//1

        //目标：掌握使用+符号做连接符的情况,方法：能加则加不能加就放一起
        int a2=5;
        System.out.println("abc"+a2);//"abc5"
        System.out.println(5+a2);//10
        System.out.println("itheima"+a2+'a');//"itheima5a"
        System.out.println(a2+'a'+"itheima");//先算a2+'a'得出102然后与后面连接得出“102itheima”
    }
}
