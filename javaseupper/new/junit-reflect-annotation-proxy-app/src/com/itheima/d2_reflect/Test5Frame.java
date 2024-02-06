package com.itheima.d2_reflect;

import org.junit.Test;

/**
 * 目标：使用反射技术：设计一个保存对象的简易版框架
 * */
public class Test5Frame {
    @Test
    public void save() throws Exception {
        Student s1=new Student("黑马吴彦祖",45,'男',180.3,"玩游戏");
        Teacher t1=new Teacher("波妞",999.9);

        //需求：把任意对象的字段名和其对应的值等信息，保存到文件中区
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(t1);

    }
}
