package com.itheima.HomeWork;

public class Test1 {
    public static void main(String[] args) {

        Vehicle a=new Vehicle("奥迪","轿车");
        Vehicle b=new Vehicle();
        b.setBrand("宝马");
        b.setType("货车");
        a.start();
        a.run();
    }
}
