package com.itheima.d8_generics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //目标:掌握泛型方法的定义和使用
        String rs=test("java");
        System.out.println(rs);

        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        go(cars);

        ArrayList<BMW> bmws=new ArrayList<>();
        cars.add(new BMW());
        cars.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs=new ArrayList<>();
        cars.add(new BENZ());
        cars.add(new BENZ());
        go(benzs);
    }

    //? 通配符，在使用泛型的时候可以代表一切类型    ? extends car(上限)只能是car或car的子类 // ？ super car（下限）只能是car或car的父类
    public static void go(ArrayList<? extends Car> cars){

    }

//    public static <T extends Car> void go(ArrayList<T> cars){
//
//    }

    public static <T> T test(T t)
    {
        return t;
    }
}
