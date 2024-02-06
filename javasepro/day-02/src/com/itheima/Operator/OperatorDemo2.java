package com.itheima.Operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //目标：掌握自增自减运算符
        int a=10;
        //a++;//a=a+1;
        ++a;
        System.out.println(a);

        //a--;//a=a-1;
        --a;
        System.out.println(a);

        //System.out.println(2++);自增自减只能操作变量不能操作字面量的否则会报错

        System.out.println("---------------------");

        int i=10;
        int rs=++i;//在非单独使用时，放在变量前面会先对变量自增或自减在进行运算
        System.out.println(rs);
        System.out.println(i);

        int b=10;
        int rs1=i++;//在非单独使用时，放在变量后面会先进行运算，再对变量进行自增自减
        System.out.println(i);
        System.out.println(rs1);
    }
}
