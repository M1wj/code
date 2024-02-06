package com.itheima.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：掌握数组的定义方式一：静态初始化数组

        //数组类型[] 数组名=new 数据类型[]{元素一，元素2，元素三};
        int[] ages=new int []{3,61,23};
        double []scores=new double []{34.3,12.1,34.3};

        //2.简化类型
        //数组类型[] 数组名={元素一，元素2，元素三};
        int[] age={3,61,23};

        //3.数组类型[]数组名 可以写成 数组类型 数组名 []
        int age1 []={3,61,23};
        System.out.println(age1);
    }
}
