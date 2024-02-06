package com.itheima.d12_extends_override;

public class Test {
    public static void main(String[] args) {

        B b=new B();
        b.print1();
        b.print2(2,3);

        Student a=new Student("D",12);
        System.out.println(a);
    }
}
