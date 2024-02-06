package com.itheima.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标：异常的处理
 * 1. 抛给最外层调用者后 捕获异常，记录异常并响应合适的信息给用户
 * */
public class ExceptionTest3 {
    public static void main(String[] args) {

        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("您要找的文件不存在");
            e.printStackTrace();//打印出这个异常对象的信息。记录下来
        } catch (ParseException e) {
            System.out.println("您要解析的时间有问题");
            e.printStackTrace();//打印出这个异常对象的信息。记录下来
        }
    }

    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse("2028-11-11 10:24");
        System.out.println(d);

        test2();
    }

    public static void test2() throws FileNotFoundException {
        //读取文件的
        InputStream is=new FileInputStream("D:/meinv.png");
    }
}
