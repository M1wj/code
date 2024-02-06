package com.itheima.d10_modifer;

import com.itheima.d9_modifer.Fu;

public class Demo2 {
    public static void main(String[] args) {
        Fu f=new Fu();
//        f.privateMethod();
//        f.method();
//        f.protectedMethod();报错
        f.publicMethod();
    }
}
