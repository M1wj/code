package com.itheima.d9_method_references;

public class Test3 {
    public static void main(String[] args) {
        //构造器引用
        //类名::new
        //如果某个Lambda表达式只是再创建对象，并且前后参数情况一致，就可以使用构造器引用

        //1.创建这个接口的匿名内部类对象
//        CreateCar cc=new CreateCar() {
//            @Override
//            public Car create(String name, double price) {
//                return new Car(name,price);
//            }
//        };

        //运用Lambda简化
        //CreateCar cc=(name,price)-> new Car(name,price) ;

        //构造器引用简化
        CreateCar cc=Car::new;

        Car c=cc.create("奔驰",49.9);
        System.out.println(c);
    }
}

interface CreateCar{
    Car create(String name,double price);
}
