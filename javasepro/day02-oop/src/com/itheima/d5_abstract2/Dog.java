package com.itheima.d5_abstract2;

public class Dog extends Animal {
    @Override
    public void cry(){
        System.out.println(getName() + "狗汪汪的叫");
    }
}
