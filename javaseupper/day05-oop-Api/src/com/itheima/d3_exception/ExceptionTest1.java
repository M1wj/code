package com.itheima.d3_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 目标:认识异常
*/
public class ExceptionTest1 {
    public static void main(String[] args) throws ParseException {
        //运行时异常:RuntimeException及其子类，编译阶段不会出现错误提醒，运行时出现的异常
        //Integer.valueof("abc");

//        int []arr={11,22,33};
//        System.out.println(arr[5]);

        //编译时异常:编译阶段就会出现错误提醒的。（如：日期解析日常）
        //处理方法
        //1.Alt+Enter+t 选择try/catch 捕获异常
        //2.在main方法后声明异常抛出 throws ParseException (在异常处按Alt+Enter）
 //       try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d=sdf.parse("2028-11-11 10:24");
            System.out.println(d);
 //       } catch (ParseException e) {
 //           e.printStackTrace();
  //      }


    }


}
