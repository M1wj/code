package com.itheima.d2_collections;

import java.util.*;

/**
 * 目标：掌握Collections集合工具类的使用
 * */
public class CollectionsTest1 {
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T>c,T...elements):为集合批量添加数据
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"张三","李四","王五","庞麻子");
        System.out.println(names);

        //2.public static void shuffle(List<?>list): 打乱List集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void sort(List<T>list):对List集合中的元素进行升序排序
        List<Integer>list=new ArrayList<>();
        Collections.addAll(list,3,5,2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        List<Student> students=new ArrayList<>();
        students.add(new Student("蜘蛛精",23,169.7));
        students.add(new Student("紫霞",22,169.8));
        students.add(new Student("紫霞",22,169.8));
        students.add(new Student("至尊宝",26,165.5));
//        Collections.sort(students);
//        System.out.println(students);

        //4.public static <T> void sort(List<T>list,Comparator<? super T>c):对List集合中元素，按照比较器对象指定的规则进行比较
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(),o2.getHeight());
//            }
//        });
        //简化
        Collections.sort(students, (o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight()));
        System.out.println(students);
    }
}
