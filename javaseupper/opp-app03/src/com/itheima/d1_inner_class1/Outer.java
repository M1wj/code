package com.itheima.d1_inner_class1;

public class Outer {
    private int age=88;
    public static String a;
    //成员内部类
    public class Inner{
        public String name;
        public static String schoolName;//jdk16开始支持定义静态成员
        private int age=99;
        public void Test(){
            System.out.println(age);
            System.out.println(a);
            int age=55;
            System.out.println(age);//55
            System.out.println(this.age);//99
            System.out.println(Outer.this.age);//88
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getA() {
        return a;
    }

    public static void setA(String a) {
        Outer.a = a;
    }
}
