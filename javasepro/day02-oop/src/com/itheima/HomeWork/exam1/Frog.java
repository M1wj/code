package com.itheima.HomeWork.exam1;

public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("蛙泳");

    }
}
