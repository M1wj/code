package com.itheima.d14_extends_constructor;

class F{
//    public F(){
//        System.out.println("父类的构造器被调用了");
//    }
    public F(String name,int age){
        System.out.println("父类有参构造器被调用");

    }

}

class Z extends F{
    //父类没有无参构造器时,需要手写super调用有参构造器否则会报错
    public  Z()
    {
        super("g",14);
        //super();//默认存在的
        System.out.println("子类的构造器被调用了");
    }
    public  Z(String name)
    {
        super("a",16);
        System.out.println("子类的有参构造器被调用了");
    }
}
public class Test {
    public static void main(String[] args) {
        //目标:先认识子类构造器的特点在掌握这个特点的常用应用场景. 特点:先调用父类的构造器在调用自己的
        Z z=new Z();
        Z z1=new Z("黑马");

    }
}
