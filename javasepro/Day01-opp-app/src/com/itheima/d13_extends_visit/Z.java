package com.itheima.d13_extends_visit;
//子类
public class Z extends F{
    String name="子类名字";
    public void showName()
    {
        String name="局部名字";
        System.out.println(name);//局部
        System.out.println(this.name);//子类
        System.out.println(super.name);//父类
    }

    @Override
    public void print1(){
        System.out.println("===子类的print1方法执行了===");
    }

    public void showMethod()
    {
        print1();//子类
        super.print1();//父类
    }
}
