package com.itheima.d10_api_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //目标：掌握Object类提供的对象克隆的方法
        //1.protected Object clone();对象克隆
        User u1=new  User(1,"zhangsan","wo6666",new double[]{99.0,99.5});
        User u2=(User) u1.clone();
    }
}
