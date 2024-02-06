package com.itheima.singleInstance;

public class Test1 {
    public static void main(String[] args) {
        //目标：掌握单例设计写法
        A a1=A.getobject();
        A a2=A.getobject();
        System.out.println(a1);
        System.out.println(a2);
    }
}
