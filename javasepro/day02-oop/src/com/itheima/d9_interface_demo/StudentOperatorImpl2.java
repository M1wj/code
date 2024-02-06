package com.itheima.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int nan=0;
        int nv=0;
        System.out.println("-------------------");
        for (int i = 0; i < students.size(); i++) {

            Student s=students.get(i);
            if(s.getSex()=='男'){
                nan++;
            }else
            {
                nv++;
            }
            System.out.println("姓名：" + s.getName() + " 性别：" + s.getSex() + " 分数：" + s.getScore());
        }
        System.out.println("男生有：" + nan + " 女生有：" + nv);
        System.out.println("-------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {

        double allscore=0;
        double max=students.get(0).getScore();
        double min=students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            if(s.getScore()>max)
            {
                max=s.getScore();
            }
            if(s.getScore()<min)
            {
                min=s.getScore();
            }
            allscore+=s.getScore();
        }
        System.out.println("最高分" + max + "最低分" + min);
        System.out.println("平均分=" + (allscore-max-min) / (students.size()-2));
    }
}
