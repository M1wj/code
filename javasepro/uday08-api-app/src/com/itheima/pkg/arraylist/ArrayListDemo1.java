package com.itheima.pkg.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //要求掌握如何创建ArrayList集合的对象，并熟悉Arraylist提供的常用方法
        //1.创建一个ArrayList集合的对象
        ArrayList list=new ArrayList();
        list.add("黑马");
        list.add(666);
        list.add(52.7);
        list.add("黑马");
        System.out.println(list);

        ArrayList <String>list1=new ArrayList<String>();//<>指定类型   后面可直接写<>不用加上String 但前面必须加
        list1.add("黑马");
        list1.add("黑马");
        System.out.println(list1);

        //1.添加到末尾
        list1.add("黑狗");
        System.out.println(list1);

        //2.向指定位置添加元素
        list1.add(1,"java");
        System.out.println(list1);

        //3.返回指定索引处的元素
        System.out.println(list1.get(1));

        //4.返回集合中元素的个数
        System.out.println(list1.size());

        //5.删除指定索引处的元素，返回被删除的元素
        list1.remove(3);
        System.out.println(list1);

        //6.删除指定的元素，返回删除是否成功
        System.out.println(list1.remove("java"));//有多个同名元素时默认删除第一次出现的

        //7.修改指定索引处的元素
        list1.set(1,"Java程序员");
        System.out.println(list1);
    }
}
