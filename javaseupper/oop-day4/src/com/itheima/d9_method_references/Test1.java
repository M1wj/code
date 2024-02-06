package com.itheima.d9_method_references;

import com.itheima.d7_Arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[]students=new Student[4];
        students[0]=new Student("蜘蛛精",169.5,23);
        students[1]=new Student("紫霞",163.8,26);
        students[2]=new Student("紫霞",163.8,26);
        students[3]=new Student("至尊宝",167.5,24);

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();//升序
//            }
//        });
//        System.out.println(Arrays.toString(students));
//
//        //使用Lambda简化后的形式
//        Arrays.sort(students,(o1,o2) -> o1.getAge()-o2.getAge() );
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students,(o1,o2)->CompareByDate.compareByAge(o1,o2));

        //静态方法引用
        //如果某个Lambda表达式里只是调用一个静态方法，并且前后参数的形式一致，
        // 就可以使用静态方法引用
        //Arrays.sort(students,CompareByDate::compareByAge);

        //实例方法引用
        //如果某个Lambda表达式里只是调用一个实例方法，并且前后参数的形式一致
        //就可以使用实例方法引用
        CompareByDate compare=new CompareByDate();
        Arrays.sort(students,compare::compareByAgeDesc);
        System.out.println(Arrays.toString(students));


    }
}
