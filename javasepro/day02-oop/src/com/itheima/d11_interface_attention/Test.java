package com.itheima.d11_interface_attention;

public class Test {
    public static void main(String[] args) {
        //目标：理解接口的继承
    }
}

interface A{
    void test1();
}
interface B{
    void test2();
}
interface C{}
interface D extends A,B,C{}
class E implements D{
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}//相当于class E implements A,B,C
