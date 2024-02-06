package com.itheima.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 目标：掌握文件字符输出流：写字符数据出去
 * */
public class FileWriterTest2 {
    public static void main(String[] args) {
        //0.创建一个文件字符输出流管道与目标文件接通
//        try (Writer fw=new FileWriter("io-app2/src/itheima02out.txt");
              try (Writer fw=new FileWriter("io-app2/src/itheima02out.txt",true);
        //覆盖管道在其后方true

        ){
            //1.public void write(int c):写一个字符出去
            fw.write('a');
            fw.write(97);
            fw.write('磊');
            //换行
            fw.write("\r\n");

            //2.public void write(String c)写一个字符串出去
            fw.write("我爱你中国adc");
            //换行
            fw.write("\r\n");

            //3.public void write(String c,int pos,int len):写字符串的一部分出去
            fw.write("我爱你中国abc",0,5);
            //换行
            fw.write("\r\n");

            //4.public void write(char[]buffer):写一个字符数组出去
            char[]buffer={'黑','马','a','b','c'};
            fw.write(buffer);
            //换行
            fw.write("\r\n");

            //5.public void write(char[]buffer,int pos,int len):写字符数组的一部分出去
            fw.write(buffer,0,2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
