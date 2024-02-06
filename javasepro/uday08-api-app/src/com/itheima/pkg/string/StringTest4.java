package com.itheima.pkg.string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入账号：");
            String login=sc.next();
            System.out.println("请您输入密码：");
            String password=sc.next();
            boolean rs=login(login,password);
            if(rs)
            {
                System.out.println("登陆成功");
                break;
            }
            else{
                System.out.println("账号密码有误~~");
            }

        }
    }
    public static boolean login(String loginName,String passWord)
    {
        String okLoginName="itheima";
        String okPassWord="123456";

        return okLoginName.equals(loginName)&&okPassWord.equals(passWord);
    }
}
