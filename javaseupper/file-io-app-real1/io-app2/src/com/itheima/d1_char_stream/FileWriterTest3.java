package com.itheima.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 目标：搞清楚字符输入流使用时的注意事项
 * */
public class FileWriterTest3 {
    public static void main(String[] args) throws IOException {
        Writer fw=new FileWriter("io-app2/src/itheima03out.txt");

        //写字符数据出去
        fw.write('a');
        fw.write('b');
        fw.write('c');
        fw.write('d');
        System.out.println("\r\n");

        fw.write("我爱你中国");
        fw.write("\r\n");
        fw.write("我爱你中国");

//        fw.flush();//刷新流
//        //刷新后的流可以继续使用
//        fw.write("张三");
//        fw.flush();
        fw.close();//关闭流包包含刷新流 但关闭后的流不可以继续使用
    }
}
