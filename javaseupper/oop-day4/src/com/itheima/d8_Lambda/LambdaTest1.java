package com.itheima.d8_Lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        //目标：认识Lambda表达式
//        Animal a=new Animal(){
//            @Override
//            public void run() {
//                System.out.println("狗跑的贼快");
//
//            }
//
//
//        };
//        a.run();

        //注意：Lambda表达式并不是说能简化全部匿名内部类的写法，只能简化函数式接口的匿名内部类(必须是接口有且仅有一个抽象方法）
//        Animal a=()->{
//            System.out.println("狗跑的贼快");
//        };
//        a.run();
//        Swimming s=new Swimming(){
//
//            @Override
//            public void swim() {
//                System.out.println("学生快乐的游泳");
//            }
//        };
//        s.swim();
        Swimming s=()->{
            System.out.println("学生快乐的游泳");
        };
        s.swim();

    }
}

interface Swimming{
    void swim();
}

abstract class Animal{
    public abstract void run();
}