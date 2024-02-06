package com.itheima.d4_enum;

public class Test2 {
    public static void main(String[] args) {
        //目的：了解枚举类的应用场景 用来表示一组信息 然后作为参数进行传输

        provideInfo(Constant.BOY);
    }
    public static void provideInfo(Constant sex){
        switch (sex){
            case BOY :
                //男生
                System.out.println("展示了一些信息给男生看");
                break;
            case GIRL:
                //女生
                System.out.println("展示了一些信息给女生看");
                break;
        }
    }
}
