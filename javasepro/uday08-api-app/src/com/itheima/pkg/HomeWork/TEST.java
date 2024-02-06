package com.itheima.pkg.HomeWork;

import java.util.ArrayList;

public class TEST {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        changeList(list);
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            System.out.print(num + " ");
        }
    }
        public static void changeList(ArrayList<Integer> list) {
            for (int i = 0; i < 3; i++) {
                int num = list.get(i);
                num *= 10;
                list.set(i, num);
            }
        }
}
