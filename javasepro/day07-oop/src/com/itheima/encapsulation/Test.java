package com.itheima.encapsulation;

public class Test {
    public static void main(String[] args) {
        //目标：掌握封装的设计规范：合理隐藏合理暴露（private与public的合理应用）
//        Student s1=new Student();
//        s1.score=100;
        //private只能在类内访问
        Student s1=new Student();
        s1.setScore(99);
        System.out.println(s1.getscore());
        s1.printPass();
    }
}
