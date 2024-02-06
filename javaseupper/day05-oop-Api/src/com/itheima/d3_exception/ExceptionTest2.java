package com.itheima.d3_exception;
/**
 *目标：掌握自定义异常，以及异常的作用
 * 分为  自定义运行时异常（不推荐使用） 自定义编译时异常
 */

public class ExceptionTest2 {
    public static void main(String[] args) {
        //需求：保存一个合法的年龄
        try {
            saveAge(160);
            System.out.println("底层执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了bug");
        }

        //saveAge2(256);不合法 会直接报错
        try {
            saveAge2(12);
            System.out.println("底层执行成功");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("底层执行失败");
        }

    }

    public static void saveAge2(int age) throws AgeIllegalException {
        if(age>0&&age<150){
            System.out.println("年龄成功被保存：" + age);
        }else{
            //用一个异常对象封装这个问题
            //throw抛出这个异常对象
            //在方法后写上throw AgeIllegalException
            throw new AgeIllegalException("/age is illegal,your age is :"+age);
        }
    }

    public static void saveAge(int age){
        if(age>0&&age<150){
            System.out.println("年龄成功被保存：" + age);
        }else{
            //用一个异常对象封装这个问题
            //throw抛出这个异常对象
            throw new AgeIllegalRuntimeException("/age is illegal,your age is :"+age);
        }
    }
}
