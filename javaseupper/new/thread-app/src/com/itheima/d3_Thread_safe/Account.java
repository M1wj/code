package com.itheima.d3_Thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;//余额
    //创建了一个锁对象
    private final Lock lk=new ReentrantLock();

    public static void test(){
        //静态方法推荐用类名.class做为锁
        synchronized (Account.class){

        }
    }

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //同步代码块
//    public void drawMoney(double money) {
//        //先搞清楚谁来取钱
//        String name=Thread.currentThread().getName();
//        //1.判断余额是否足够
//        //锁应该为共享资源
//        synchronized ("this") {
//            if(this.money>=money){
//                System.out.println(name + "来取钱" + money + "成功");
//                this.money-=money;
//                System.out.println(name + "来取钱后，余额剩余" + this.money);
//            }else{
//                System.out.println(name + "来取钱：余额不足");
//            }
//        }
//    }

    //同步方法
//    public synchronized void drawMoney(double money) {
//        //先搞清楚谁来取钱
//        String name=Thread.currentThread().getName();
//        //1.判断余额是否足够
//            if(this.money>=money){
//                System.out.println(name + "来取钱" + money + "成功");
//                this.money-=money;
//                System.out.println(name + "来取钱后，余额剩余" + this.money);
//            }else{
//                System.out.println(name + "来取钱：余额不足");
//            }
//
//    }

    //lock锁
    public  void drawMoney(double money) {
        //先搞清楚谁来取钱
        String name=Thread.currentThread().getName();

        //1.判断余额是否足够
        try {
            lk.lock();//加锁
            if(this.money>=money){
                System.out.println(name + "来取钱" + money + "成功");
                this.money-=money;
                System.out.println(name + "来取钱后，余额剩余" + this.money);
            }else{
                System.out.println(name + "来取钱：余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();//解锁
        }


    }
}
