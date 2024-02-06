package com.itheima.d4_collection_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 目标：掌握TreeSet集合的使用 可排序（升序） 不重复 无索引
 * */
public class SetTest4 {
    public static void main(String[] args) {
        Set<Integer> set1=new TreeSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);

        //有两种方式解决 要自定义比较规则
        //1.让自定义的类（如学生类）实现Comparable接口 重写里面的compareTo方法来指定比较规则
        //2.通过调用TreeSet集合有参数构造器 可以设置Comparator对象（比较器对象，用于指定比较规则）
        //TreeSet就近选择自己自带的比较器对象进行排序
//        Set<Student> students =new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //需求 按照升序排序
//                return Double.compare(o1.getHeight(), o2.getHeight());
//            }
//        });
        //简化
        Set<Student> students =new TreeSet<>((o1,o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
        students.add(new Student("蜘蛛精",23,169.7));
        students.add(new Student("紫霞",22,169.8));students.add(new Student("至尊宝",26,169.5));
        students.add(new Student("牛魔王",22,183.5));
        System.out.println(students);
    }
}
