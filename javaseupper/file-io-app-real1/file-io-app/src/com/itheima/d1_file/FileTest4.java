package com.itheima.d1_file;

import java.io.File;
import java.util.Arrays;

/**
 * 目标：掌握File提供的遍历文件夹的方法
 * */
public class FileTest4 {
    public static void main(String[] args) {
        //1.public String[]list():获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
        File f1=new File("D:\\studytools");
        String[]names=f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        //2.public File[] listFiles():(重点)获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回（重点）
        File[]files=f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        //使用listFiles方法时的注意事项
        //1.当主调是文件，或者路径不存在时，返回null
        File f=new File("D:/resource/ab.txt");
        File [] files1=f.listFiles();
        System.out.println(files1);

        //2.当主调是空文件夹时，返回一个长度为0的数组
        File f2=new File("D:/resource/aaa");
        File [] files2=f.listFiles();
        System.out.println(Arrays.toString(files2));

        //3.当主调是一个文件夹 且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件

        //4.当主调是一个文件夹，但是没有权限访问该文件夹时，返回null


    }
}
