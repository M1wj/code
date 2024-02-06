package com.itheima.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("-------------------");
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            System.out.println("姓名：" + s.getName() + " 性别：" + s.getSex() + " 分数：" + s.getScore());
        }
        System.out.println("-------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {

        double allscore=0;
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            allscore+=s.getScore();
        }
        System.out.println("平均分=" + (allscore) / students.size());
    }
}
