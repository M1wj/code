package com.itheima.HomeWork;

class Person {
    String name="person";
    public void shout(){
        System.out.println(name);
    }
}
class Student extends Person{
    String name="student";
    String school="school";
}
public class Test {
    public static void main(String[ ] args) {
        Person p=new Student();
        System.out.println(p instanceof Student);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Object);;
        //System.out.println(p instanceof System);
    }
}