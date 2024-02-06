package com.itheima.d12_extends_override;

public class B extends A{
    //方法重写 声明不变 重新实现
    @Override
    public void print1(){
        System.out.println("666");
    }

    //方法重写
    @Override
    public  void print2(int a,int b){
        System.out.println("666666");
    }
}
