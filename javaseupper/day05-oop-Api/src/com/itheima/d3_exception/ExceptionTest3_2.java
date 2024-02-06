package com.itheima.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的写法优化：
 1：由于Exception时所用异常的祖宗类，
 所以抛出异常时最好直接抛出Exception
 而不是抛出具体的异常
 2：在捕获异常时直接catch Exception异常即可

 * */
public class ExceptionTest3_2 {
    public static void main(String[] args) {

        try {
            test1();
        }
         catch (Exception e) {
            System.out.println("您当前操作有问题");
            e.printStackTrace();//打印出这个异常对象的信息。记录下来
        }
    }

    public static void test1() throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse("2028-11-11 10:24");
        System.out.println(d);

        test2();
    }

    public static void test2() throws Exception {
        //读取文件的
        InputStream is=new FileInputStream("D:/meinv.png");
    }
}
