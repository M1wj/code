package com.itheima.pkg.arraylistanli;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList=new ArrayList<>();

    //上架商品功能
    public void addFood()
    {
        //创建一个菜品对象
        Food f=new Food();

        //录入菜品信息
        Scanner sc=new Scanner(System.in);

        System.out.println("输入菜品名字");
        String name=sc.next();
        f.setName(name);

        System.out.println("输入菜品价格");
        double price= sc.nextDouble();
        f.setPrice(price);

        System.out.println("输入菜品其他信息");
        String desc=sc.next();
        f.setDesc(desc);

        //将菜品信息存入到集合中去
        foodList.add(f);
        System.out.println("上架成功");
    }

    public void showAllFoods()
    {
        if(foodList.size()==0)
        {
            System.out.println("没有任何菜品");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food s=foodList.get(i);
            System.out.println("商品名称："+s.getName());
            System.out.println("商品价格："+s.getPrice());
            System.out.println("商品其他信息："+s.getDesc());
            System.out.println("------------");
        }
    }

    //展示操作界面
    public void start()
    {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("菜品系统");
            System.out.println("1.上架菜品");
            System.out.println("2.展示菜品信息");
            System.out.println("3.退出系统");
            System.out.println("请输入您的操作");
            String command=sc.next();
            switch(command)
            {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("您的输入有误");

            }
        }

    }

}
