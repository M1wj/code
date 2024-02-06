package com.itheima.d5_abstract2;

public class Cat extends Animal {
    @Override
    public void cry(){
        System.out.println(getName() + "猫喵喵的叫");
    }
}
