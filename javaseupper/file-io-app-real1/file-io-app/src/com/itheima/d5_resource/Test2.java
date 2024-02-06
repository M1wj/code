package com.itheima.d5_resource;

import java.io.*;
/**掌握释放资源的方式*/
public class Test2 {
    public static void main(String[] args)  {
        InputStream is=null;
        OutputStream os=null;

        try {
            //需求：复制照片
            //1.创建一个字节输入流管道与源文件接通
            is=new FileInputStream("D:/1/1.jpg");
            //2.创建一个字节输出流管道与目标文件接通
            os=new FileOutputStream("D:/2/2.jpg");

            System.out.println(10 / 0);
            //3.创建一个字节数组，负责转移字节数据
            byte []buffer=new byte[1024];//1KB
            //4.从字节输入流中读取字节数据，写出到字节输出流中。读多少写多少
            int len;//记住每次读取了多少字节
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }

            System.out.println("复制完成");
        }
         catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            try {
                if(os!=null)
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null)
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
