package com.itheima.d1_file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //目标：改变某个文件夹下视频的序号，需求从19开始
        File dir=new File("D:\\javavideo\\java基础video\\day02-二进制、运算符、数据类型、Scanner\\视频");

        //1.拿到下面全部的视频，一级文件对象
        File[]videos=dir.listFiles();

        //2.一个一个的找
        for (File video : videos) {
            //3.拿到它的名字，改成新名字
            String name=video.getName();//name="10、多态，继承"
            String index=name.substring(0,name.indexOf("、"));
            String lastName=name.substring(name.indexOf("、"));
            String newName=(Integer.valueOf(index)+18)+lastName;

            //4.正式改名
            video.renameTo(new File(dir,newName));
        }
    }
}
