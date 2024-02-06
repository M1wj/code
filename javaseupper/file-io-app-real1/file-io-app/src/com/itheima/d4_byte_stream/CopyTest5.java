package com.itheima.d4_byte_stream;

import java.io.*;

/**
 * 目标：使用字节流完成对文件的复制操作
 * */
public class CopyTest5 {
    public static void main(String[] args) throws IOException {
        //需求：复制照片
        //1.创建一个字节输入流管道与源文件接通
        InputStream is=new FileInputStream("D:/1/1.jpg");
        //2.创建一个字节输出流管道与目标文件接通
        OutputStream os=new FileOutputStream("D:/2/2.jpg");
        //3.创建一个字节数组，负责转移字节数据
        byte []buffer=new byte[1024];//1KB
        //4.从字节输入流中读取字节数据，写出到字节输出流中。读多少写多少
        int len;//记住每次读取了多少字节
        while((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        //后创建的流先关掉
        //先创建的流后关掉
        os.close();
        is.close();
        System.out.println("复制完成");
    }
}
