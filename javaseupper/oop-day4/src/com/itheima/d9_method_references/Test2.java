package com.itheima.d9_method_references;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        //掌握特定类型的方法引用
        /*特定类型的方法引用
        如果某个Lambda表达式里只是调用一个实例方法，并且
        前面参数列表中的第一个参数是作为方法的主调后面的
        所有参数都是作为该实例方法的入参的，则此时就可以
        使用特定类型的方法引用*/

        String []names={"baby","angle","Andy","dlei","caocao","Babo","jack","Cici"};

        //进行排序(默认按照字符串首字符编号升序排序)
//        Arrays.sort(names);

        //要求忽略大小写
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
        //简化
        //Arrays.sort(names,(o1,o2)-> o1.compareToIgnoreCase(o2));

        //特定类型方法引用简化
        Arrays.sort(names,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
