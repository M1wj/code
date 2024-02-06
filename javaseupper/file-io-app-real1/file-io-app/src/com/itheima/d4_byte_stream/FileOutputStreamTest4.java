package com.itheima.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 目标：掌握文件字节输出流Fi了OutputStream的使用
 * */
public class FileOutputStreamTest4 {
    public static void main(String[] args) throws IOException {
        //1.创建一个字节输出流管道与目标文件接通
        //覆盖管道：覆盖之前的数据
//        OutputStream os=new FileOutputStream("file-io-app/src/itheima04out.txt");
        OutputStream os=new FileOutputStream("file-io-app/src/itheima04out.txt",true);

        //2.开始写字节数据出去了
        os.write(97);//代表一个字节 代表a
        os.write('b');//也是一个字节
        //os.write('磊');//只能写一个字节 汉字为三个字节

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);

        os.write(bytes,0,bytes.length-3);

        //换行符
        os.write("\r\n".getBytes());

        os.close();//关闭流
    }
}
