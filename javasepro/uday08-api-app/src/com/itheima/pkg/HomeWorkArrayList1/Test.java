package com.itheima.pkg.HomeWorkArrayList1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Person a=new Person(1,"尼古拉斯","男");
        Person b=new Person(2,"马儿扎哈","男");
        Person c=new Person(3,"迪丽热巴","女");
        Person d=new Person(4,"阿凡提买买提","男");
        Person e=new Person(5,"王宝强","男");
        Person f=new Person(6,"柳岩","女");

        ArrayList<Person> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        for (int i = 0; i < list.size(); i++) {
            if(!(list.get(i).getSex()=="男"&&list.get(i).getName().length()>=3)){
                System.out.println("id:" + list.get(i).getId() + "   性别：" + list.get(i).getSex() + "   姓名：" + list.get(i).getName());
            }
            else{
                list.remove(i);
            }
        }
    }
}
