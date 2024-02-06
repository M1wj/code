package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;

/**
 * 目标：掌握File创建对象，代表具体文件的方案
 * */
public class FileTest1 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File对象，指代某个具体的文件
//        File f1=new File("D:\\FileStudy\\ab.txt");
        //还可以写为

/**             最常用的写法                      */
//        File f1=new File("D:/FileStudy/ab.txt");


        File f1=new File("D:"+File.separator+"FileStudy"+File.separator+"ab.txt");
        System.out.println(f1.length());//文件大小 字节

        File f2=new File("D:/FileStudy");
        System.out.println(f2.length());

        //注意：File对象可以指代一个不存在的文件路径
        File f3=new File("D:\\FileStudy\\aaaa.txt");
        System.out.println(f3.length());
        System.out.println(f3.exists());//false

        //我现在要定位的文件是在模块中，应该怎么定位呢？
        //绝对路径：带盘符的
        //File f4=new File("D:\\code\\javaseupper\\file-io-app-real1\\file-io-app\\src\\itheima.txt");
        //相对路径（重点）：不带盘符，默认是直接去工程下寻找文件的
        File f4=new File("file-io-app\\src\\itheima.txt");
        f4.createNewFile();
        System.out.println(f4.exists());
        System.out.println(f4.length());
    }
}
