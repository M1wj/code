package com.itheima.d11_extends_feature;

public class Teest {
    public static void main(String[] args) {
        //目标:掌握继承的两个注意事项
        //1.java是单继承的:一个类只能继承一个直接父类;java中的类不支持多继承,但是支持多层继承
        //2.Object类是Java中所有类的祖宗
        A a=new A();
        B b=new B();
    }
}
class A{}
class B extends A{}
//class C extends B,A{} //报错
class D extends B{}
