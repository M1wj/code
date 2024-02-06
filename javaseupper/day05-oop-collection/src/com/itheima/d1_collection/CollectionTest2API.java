package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest2API {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();//多态写法
        //1.public boolean add(E e) : 添加元素，添加成功返回true
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java1");
        System.out.println(c);

        //2.public void clear() : 清空集合的元素
        //c.clear();
        //System.out.println(c);

        //3.public boolean isEmpty() : 判断集合是否为空 是空返回 true 反之。
        System.out.println(c.isEmpty());

        //4.public int size() : 获取集合的大小。
        System.out.println(c.size());

        //5.public boolean contains(Object obj) : 判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));
        System.out.println(c.contains("Java1"));

        //6.public boolean remove(E e) : 删除某个元素:如果有多个重复元素默认删除前面的第一个！
        System.out.println(c.remove("java1"));
        System.out.println(c);

        //7.public Object[] toArray(): 把集合转换成数组
        Object [] obj=c.toArray();
        System.out.println(Arrays.toString(obj));

        String []arr2=c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------------------");

        //把一个集合的全部数据导入到另一个集合中去
        Collection<String> c1=new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2=new ArrayList<>();
        c1.add("java3");
        c1.add("java4");
        c1.addAll(c2);//就是把c2集合的全部数据倒入到c1集合中去
        System.out.println(c1);
        System.out.println(c2);
    }
}
