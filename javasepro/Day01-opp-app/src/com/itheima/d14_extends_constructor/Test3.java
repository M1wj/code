package com.itheima.d14_extends_constructor;

public class Test3 {
    public static void main(String[] args) {
        //this()调用兄弟构造器
        Student s1=new Student("SN",15,"家里蹲");
        Student s2=new Student("SM",17);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchoolName());
    }
}

class Student{
    private  String name;
    private  int age;
    private  String schoolName;

    public Student() {
    }

    public Student(String name,int age){
        this(name,age,"黑马程序员");
    }
    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
