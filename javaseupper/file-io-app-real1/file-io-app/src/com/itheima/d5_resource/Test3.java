package com.itheima.d5_resource;

import java.io.*;

public class Test3 {
    public static void main(String[] args)  {


        try (
              //注意：这里只能放置资源对象（流对象）
              //什么是资源呢？资源都是会实现AutoCloseable接口
              //用完之后，会被自动调用其close方法完成资源的释放操作

                //需求：复制照片
             //1.创建一个字节输入流管道与源文件接通
             InputStream is=new FileInputStream("D:/1/1.jpg");
             //2.创建一个字节输出流管道与目标文件接通
             OutputStream os=new FileOutputStream("D:/2/2.jpg");

             MyConnection cnn=new MyConnection();
             ){



            //3.创建一个字节数组，负责转移字节数据
            byte []buffer=new byte[1024];//1KB
            //4.从字节输入流中读取字节数据，写出到字节输出流中。读多少写多少
            int len;//记住每次读取了多少字节
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }

            System.out.println("复制完成");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        }
    }

