package com.itheima.d3_collection_list;

import java.util.LinkedList;

/**
   目标：掌握Linkedlist集合的使用
 */
public class ListTest3 {
    public static void main(String[] args) {
        //1、创建一个队列
        LinkedList<String> queue=new LinkedList<>();
        //入队
        queue.addLast("第一号人");
        queue.addLast("第二号人");
        queue.addLast("第三号人");
        queue.addLast("第四号人");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        System.out.println("-------------------");

        //2、创建一个栈对象
        LinkedList<String> stack=new LinkedList<>();
        //压栈(push)
//        stack.addFirst("第一颗子弹");
//        stack.addFirst("第二颗子弹");
//        stack.addFirst("第三颗子弹");
//        stack.addFirst("第四颗子弹");
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");
        System.out.println(stack);

        //出栈(pop)
//        System.out.println(stack.removeFirst());
//        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
