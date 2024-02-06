package com.itheima.d10_api_object;

public class Test {
    public static void main(String[] args) {
        //目标：掌握Object类提供的常用方法
        Student s1=new Student("赵敏",23);
        //System.out.println(s1.toString());//toString()可省略不写默认输出s1时会自动调用
        System.out.println(s1);

        //判断两个对象地址是否相同
        Student s2=new Student("赵敏",23);
        //System.out.println(s2.equals(s1));//不重写是比较地址
        System.out.println(s1 == s2);


        //判断两个对象的内容是否相同
        System.out.println(s2.equals(s1));

    }
}
