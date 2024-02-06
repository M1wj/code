package com.itheima.d2_enum2;

public class Test {
    public static void main(String[] args) {
        //目标掌握枚举类的使用场景
        provideInfo(Constant.BOY);
    }
    public static void provideInfo(Constant sex){
        switch(sex)
        {
            case  BOY:
                //男生
                System.out.println("展示一些信息给男生看");
                break;
            case  GIRL:
                //女生
                System.out.println("展示一些信息给女生看");
                break;
        }
    }
}
