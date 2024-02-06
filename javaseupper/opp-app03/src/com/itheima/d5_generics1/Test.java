package com.itheima.d5_generics1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //泛型
        ArrayList list1=new ArrayList();
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");
        list1.add("java4");
        for (int i = 0; i < list1.size(); i++) {
            String s=(String) list1.get(i);
            System.out.println(s);
        }

        ArrayList <String> list2=new ArrayList<>();//后面的可以省略 在jdk1.7以后
        list2.add("java1");
        list2.add("java2");
        list2.add("java3");
        list2.add("java4");
        for (int i = 0; i < list2.size(); i++) {
            String s1= list2.get(i);
            System.out.println(s1);
        }
    }
}
