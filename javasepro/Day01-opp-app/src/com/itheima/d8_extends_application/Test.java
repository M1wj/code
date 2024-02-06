package com.itheima.d8_extends_application;

public class Test {
    //目标搞清楚继承的好处：减少重复代码的编写
    public static void main(String[] args) {

        Teacher t=new Teacher();
        t.setName("播仔");
        t.setSkill("java、Spring");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();
    }
}
