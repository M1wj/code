package com.HomeWork;

interface Inter {
    void show();
}
class Outer {
   public static Inter method()
   {
       class son implements Inter{

           @Override
           public void show() {
               System.out.println("HelloWorld");
           }
       }
       return new son();
   }


}

class A implements Inter{
    public void show(){
        System.out.println("HelloWorld");
    }
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}