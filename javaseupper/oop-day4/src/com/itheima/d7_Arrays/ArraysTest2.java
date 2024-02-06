package com.itheima.d7_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest2 {
    public static void main(String[] args) {
        //目标：掌握如何对数组中的对象进行排序
        Student[]students=new Student[4];
        students[0]=new Student("蜘蛛精",169.5,23);
        students[1]=new Student("紫霞",163.8,26);
        students[2]=new Student("紫霞",163.8,26);
        students[3]=new Student("至尊宝",167.5,24);

        //1.public static void sort(类型[]arr)对数组进行排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //2.public static <T> void sort(T[]arr,Comparator<? super T> c)
        //参数一：需要排序的数组
        //参数二：Comparator比较器对象（用来制定对象的比较规则）
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定比较规则：左边对象o1 右边对象o2
                //约定1：认为左边 > 右边 返回正整数
                //约定2：认为左边 < 右边 返回正整数
                //约定3：认为左边 = 右边 返回0
//                if(o1.getHeight()>o2.getHeight())
//                    return 1;
//                else if(o1.getHeight()<o2.getHeight())
//                    return -1;
//                return 0;//升序
                return Double.compare(o1.getHeight(),o2.getHeight());//升序
                //return Double.compare(o1.getHeight(),o2.getHeight());//降序

            }
        });
        System.out.println(Arrays.toString(students));


    }
}
