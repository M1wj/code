package com.itheima.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：多态的好处
        //1.可以实现解耦合，右边对象可以随时切换，后续业务随机应变
        People p1=new Student();
        p1.run();
       // p1.study();//无法调用子类独有的功能
        //强制类型转换
        Student t1=(Student)p1;
        t1.study();

        System.out.println("-------------");
        if(p1 instanceof Student){
            Student s2=(Student) p1;
            s2.study();
        }else{
            Teacher t2=(Teacher) p1;
            t2.teach();
        }


        Student s=new Student();
        go(s);

        Teacher t=new Teacher();
        go(t);
    }

    //2.可以使用父类类型的变量作为形参，可以接受一切子类对象
    private static void go(People s) {
        s.run();
        if(s instanceof Student){
            Student s2=(Student) s;
            s2.study();
        }else{
            Teacher t2=(Teacher) s;
            t2.teach();
        }
    }
}
