package com.itheima.thisdemo;

public class Test {
    public static void main(String[] args) {
        //目标：认识this，掌握this的应用场景.解决变量名称冲突问题
        Student s1=new Student();
        System.out.println(s1);
        s1.printthis();

        System.out.println("--------------");
        Student s2=new Student();
        System.out.println(s2);
        s2.printthis();

        Student s3=new Student();
        s3.score=380;
        s3.printfPass(250);
    }
}
