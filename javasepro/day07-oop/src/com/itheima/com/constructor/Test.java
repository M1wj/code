package com.itheima.com.constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识构造器，并掌握构造器的特点应用场景注意事项
        Student a=new Student();
        Student b=new Student("播仔",99);

        Student s1=new Student();
        s1.name="播妞";
        s1.score=100;

        Student s2=new Student("播仔",59);
        System.out.println(s2.name);
        System.out.println(s2.score);

        Teacher t=new Teacher();
    }
}
