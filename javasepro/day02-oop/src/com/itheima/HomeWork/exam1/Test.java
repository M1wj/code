package com.itheima.HomeWork.exam1;

public class Test {
    public static void main(String[] args) {
        Breeder a=new Breeder();
        Animal d=new Dog();
        a.feed1(d);

        Breeder b=new Breeder();
        Animal s=new Sheep();
        b.feed1(s);

        Breeder c=new Breeder();
        Animal f=new Frog();
        c.feed1(f);
    }
}
