package com.itheima.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：掌握数组的访问
        int []age={14,33,78};
        for (int i = 0; i <=2 ; i++) {
            System.out.println(age[i]);
        }

        //修改数组数据
        age[0]=14;
        age[1]=15;
        age[2]=16;
        for (int i = 0; i <=2 ; i++) {
            System.out.println(age[i]);
        }

        //访问数组中的元素个数
        System.out.println(age.length);

        //获取数组中的最大索引 length-1 但是数组必须是存在数据
        System.out.println(age.length - 1);
    }
}
