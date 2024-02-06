package com.itheima.pkg.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList <String>list =new ArrayList<>();
        list.add("JAVA入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);
        //方法一
//        for (int i = 0; i < list.size(); i++) {
//            String s=list.get(i);
//            if(s.contains("枸杞"))
//            {
//                list.remove(s);
//                i--;
//            }
//        }
//        System.out.println(list);
        //方法二
        for(int i= list.size()-1;i>=0;i--)
        {
            String s=list.get(i);
            if(s.contains("枸杞")) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
