package com.itheima.d1_create_thread;
/**
 * 目标：掌握线程的创建方式之一:继承Thread类
 * */
public class ThreadTest1 {
    //main方法是由一条默认的主线程负责执行
    public static void main(String[] args) {

        /**不能把主线程的任务放在启动子线程之前*/
//        for (int i = 1; i <=5 ; i++) {
//            System.out.println("主线程main输出"+i);
//        }



        //3.创建MyThread线程类的对象代表一个线程
        Thread t=new MyThread();
        //4.启动线程 必须调用start方法 不能调用run方法
        t.start();// main线程 t线程

        for (int i = 1; i <=5 ; i++) {
            System.out.println("主线程main输出"+i);
        }

    }
}
