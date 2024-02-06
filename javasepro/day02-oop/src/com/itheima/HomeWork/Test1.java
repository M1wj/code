package com.itheima.HomeWork;

interface Parent{
public int count(int i);
}

public class Test1 implements Parent {
public int count(int i){
return i % 9;
    }
  public static void main(String[] args){
// 此处写什么代码？
      Test1 p=new Test1();
int i = p.count(20);
      System.out.println(i);
  }
}