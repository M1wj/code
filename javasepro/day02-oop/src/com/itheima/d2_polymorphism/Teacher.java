package com.itheima.d2_polymorphism;

public class Teacher extends People {
    @Override
    public void run()
    {
        System.out.println("老师跑的气喘吁吁");
    }

    public void teach()
    {
        System.out.println("老师正在教知识");
    }

}
