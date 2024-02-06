package com.itheima.d7_Arrays;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    //指定比较规则
    //this o
    @Override
    public int compareTo(Student o){
        //约定1：认为左边 > 右边 返回正整数
        //约定2：认为左边 < 右边 返回正整数
        //约定3：认为左边 = 右边 返回0
        //按照年龄升序排序
        if(this.age>o.age)
            return 1;
        else if(this.age<o.age)
            return -1;
        return 0;
        //以上代码可以写为一句话
        //return this.age-o.age;
    }

    public Student() {
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
