package com.itheima.d2_polymorphism;

public class Student extends People {
    @Override
    public void run()
    {
        System.out.println("学生跑的贼快~~");
    }

    public void study()
    {
        System.out.println("学生需要学习");
    }
}
