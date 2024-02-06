package com.itheima.d8_Lambda;

import com.itheima.d7_Arrays.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class LambdaTest2 {
    public static void main(String[] args) {
        double []prices={99.8,128,100};
        //把所有的价格都打八折，然后又存进去
//        Arrays.setAll(prices, (int value)-> {
//                return prices[value]*0.8;
//            }
//        );

        //Lambda表达式的省略写法
        //1.参数类型可以省略不写
//        Arrays.setAll(prices, ( value)-> {
//                    return prices[value]*0.8;
//                }
//        );

        //2.如果只有一个参数，参数类型可以省略，同时（）可以省略
//        Arrays.setAll(prices,  value -> {
//                  return prices[value]*0.8;
//              }
//        );
        //3.如果Lambda表达式中的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！
        //此时如果这行代码是return语句，也必须去掉return不写
        Arrays.setAll(prices,  value -> prices[value]*0.8);

        System.out.println(Arrays.toString(prices));

        Student[]students=new Student[4];
        students[0]=new Student("蜘蛛精",169.5,23);
        students[1]=new Student("紫霞",163.8,26);
        students[2]=new Student("紫霞",163.8,26);
        students[3]=new Student("至尊宝",167.5,24);
        Arrays.sort(students, ( o1,  o2)-> Double.compare(o1.getHeight(),o2.getHeight())/*升序*/);
        System.out.println(Arrays.toString(students));
    }
}
