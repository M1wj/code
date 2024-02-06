package com.itheima.HomeWork;

class Base {
    public void method(){
        System.out.print ("Base method");
    }
}
class Child extends Base{
    public void methodB(){
        System.out.print ("Child methodB");
    }
}
class Sample {
    public static void main(String[] args) {
        Base base= new Child();
        ((Child) base).methodB();
    }
}
