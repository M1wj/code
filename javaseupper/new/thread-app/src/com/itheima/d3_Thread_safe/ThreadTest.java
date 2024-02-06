package com.itheima.d3_Thread_safe;
/**
 * 目标：模拟线程安全问题
 * */
public class ThreadTest {
    public static void main(String[] args) {
        //1.创建一个账户对象代表两个人的共享账户
        Account acc=new Account("ICBC-110",100000);
        //2.创建两个线程分别代表小明小红，再去通一个账户取钱
        new DrawThread(acc,"小明").start();//小明
        new DrawThread(acc,"小红").start();//小红

//        //1.创建一个账户对象代表两个人的共享账户
//        Account acc1=new Account("ICBC-210",100000);
//        //2.创建两个线程分别代表小明小红，再去通一个账户取钱
//        new DrawThread(acc1,"小黑").start();//小黑
//        new DrawThread(acc1,"小白").start();//小白


    }
}
