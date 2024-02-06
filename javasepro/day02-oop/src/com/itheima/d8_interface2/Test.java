package com.itheima.d8_interface2;

public class Test   {
    public static void main(String[] args) {
        //搞清使用接口的好处
        Driver s=new A();
        s.drive();

        Singer d=new A();
        d.sing();

        Driver d1=new B();
        d1.drive();
    }
}
class B implements Driver{
    @Override
    public void drive(){

    }
}

class A extends Student implements Driver,Singer{
    @Override
    public void drive(){

    }

    @Override
    public void sing(){

    }

}

class Student{

}

interface Driver{
    void drive();

}

interface Singer{
    void sing();
}