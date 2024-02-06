package com.itheima.HomeWork.exam2;

import java.util.Scanner;

public class RemoteControl {
    Scanner sc=new Scanner(System.in);
    public void controlTV(Tv tv){
        System.out.println("遥控器控制电视");
        System.out.println("请输入节目名称");
        String jiemu=sc.next();
        tv.play(jiemu);
    }
}
