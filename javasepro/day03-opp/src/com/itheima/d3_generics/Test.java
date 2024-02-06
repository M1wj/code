package com.itheima.d3_generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //目标：认识泛型
        ArrayList list=new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add("java3");

        for (int i = 0; i < list.size(); i++) {
            String e=(String) list.get(i);
            System.out.println(e);
        }

        System.out.println("---------");
        ArrayList<String> list1=new ArrayList<>();//后面<>中的String可以省略 JDK1.7后
        list1.add("Java1");
        list1.add("Java2");
        list1.add("Java3");

        for (int i = 0; i < list1.size(); i++) {
            String e=list1.get(i);
            System.out.println(e);
        }

    }
}
