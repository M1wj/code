package com.itheima.HomeWork.exam1;

public class Dog extends Animal implements Swim{
    @Override
    public void eat()
    {
        System.out.println("啃骨头");
    }

    @Override
    public void swimming(){
        System.out.println("狗刨");
    }
}
