package com.HomeWork.exam3;

public class Test {
    public static void main(String[] args) {
        // 在此处完成代码
        A a=new A();
        a.methodA(new InterA() {
            @Override
            public void showA() {

            }
        });
        class myInter implements InterA{

            @Override
            public void showA() {

            }
        }
        A a2=new A();
        a2.methodA(new myInter());

    }
}
//定义接口
interface InterA {
    void showA();
}
class A implements InterA{
    public void methodA(InterA a) {
        a.showA();
    }

    @Override
    public void showA() {

    }
}