package com.itheima.d3_inner_class3;

public class Test2 {
    public static void main(String[] args) {
        //匿名内部类的使用场景1 通常作为一个参数传输给方法 核心目的：简化代码
        Swimming s1=new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游得飞快");
            }
        };

        go(s1);

        go(new Swimming(){
            @Override
            public void swim(){
                System.out.println("猫游得还行");
            }

        });

    }
    public static void go(Swimming s){
        System.out.println("开始-----");
        s.swim();
    }
}

interface Swimming{
    void swim();
}
