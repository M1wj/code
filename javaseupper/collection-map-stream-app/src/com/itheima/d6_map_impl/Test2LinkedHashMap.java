package com.itheima.d6_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 目标：掌握LinkedHashMap的底层原理
 * */
public class Test2LinkedHashMap {
    public static void main(String[] args) {
        //Map<String,Integer> map=new HashMap<>();//一行经典代码 按照键 无序 不重复 无索引
        Map<String,Integer> map=new LinkedHashMap<>();//一行经典代码 按照键 有序 不重复 无索引
        map.put("手表",100);
        map.put("手表",220);// 后面重复的数据会覆盖前面的数据（键）
        map.put("手机",2);
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);
    }
}
