package com.itheima.d5_collection_exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 目标：理解集合的并发修改异常问题，并解决
 * */
public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱花");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        System.out.println(list);
        // [王麻子 ,小李子 ,李爱花,张全蛋,晓李,李玉刚]

        //需求：找出集合中全部带李的名字，并从集合中删除
//        Iterator<String> it=list.iterator();
//        while(it.hasNext()){
//            String name=it.next();
//            if(name.contains("李")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

        //使用for循环遍历集合并删除对象
//        for (int i = 0; i < list.size(); i++) {
//            String name=list.get(i);
//            if(name.contains("李")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

        System.out.println("-----------");
        //怎么解决?
        //使用for循环遍历集合并删除对象 如下或者倒着删除
//        for (int i = 0; i < list.size(); i++) {
//            String name=list.get(i);
//            if(name.contains("李")){
//                list.remove(name);
//                i--;
//            }
//        }
//        System.out.println(list);

        //需求：找出集合中全部带李的名字，并从集合中删除
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String name=it.next();
            if(name.contains("李")){
                //list.remove(name);//并发修改的异常
                it.remove();//删除迭代器当前遍历到的数据，没删除一个数据后，相当于底层也做了i--
            }
        }
        System.out.println(list);

        //使用增强for循环遍历集合并删除数据，没有办法解决bug 应为其底层逻辑代码是迭代器的简化
//        for (String name : list) {
//            if(name.contains("李")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

        //Lambda 也不能解决 其底层逻辑代码是增强for循环
//        list.forEach(name->{
//            if(name.contains("李")){
//                list.remove(name);
//            }
//        });
//        System.out.println(list);
    }
}
