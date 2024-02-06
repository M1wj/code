package com.itheima.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        //目标：掌握方法重载的应用场景
        fire();
        fire("日本");
        fire("日本",99999);


    }

    public static void fire()
    {
        System.out.println("给岛国发射一枚武器");
    }
    public static void fire(String country)
    {
        System.out.println("发射一枚武器给" + country);
    }
    public static void fire(String country,int number)
    {
        System.out.println("发射" + number + "枚武器给" + country);
    }
}
