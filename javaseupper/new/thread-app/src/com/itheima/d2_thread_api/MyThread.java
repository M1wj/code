package com.itheima.d2_thread_api;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);//为当前线程设置名字
    }
    @Override
    public void run() {
        //哪个线程执行他，他就会得到哪个线程对象
        Thread t=Thread.currentThread();
        for (int i = 1; i <=5 ; i++) {
            System.out.println(t.getName()+"线程" + i);
        }
    }
}
