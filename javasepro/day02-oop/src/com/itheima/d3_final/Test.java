package com.itheima.d3_final;

public class Test {
    /*
    常量
    public static final修饰的成员变量，建议名称全部大写多个单词下划线连接
    */
    public static final String SCHOOL_NAME="黑马";
    private final String name ="白马";
    public static void main(String[] args) {

        //目标：认识final的作用
        //3.final可以修饰变量总规则 有且仅能赋值一次
        /*变量：
        1.局部变量
        2.成员变量
          1.静态成员变量
          2.实例成员变量
          */
        final int a;
        a=10;
        //a=23;//第二次赋值 出错

        //schoolName="白马";二次赋值 出错
    }
    public static void buy(final double z){
        //z=0.1;//不能修改
    }
}

//1.final修饰类，类不能被继承
final class A{}
//class B extends A{}

//2.final修饰方法，方法不能被重写
class C{
    public final void test(){}
}
//class D extends C{
//    @Override
//    public final void test(){
//
//    }
//}