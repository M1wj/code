package com.itheima.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        //目标：认识方法重载，并掌握其应用场景
        //一个类中，只要一些方法名称相同，形参列表不同那么他们就是方法重载了，其他的都不管
        //形参列表不同指的是：形参的个数，类型，顺序不同，不关心形参的名称
        test();
    }

    public static void test(){

    }

    public static void test(int a){

    }

    void test(double a){

    }

    int test(int a,int b){
        return 0;

    }

}
