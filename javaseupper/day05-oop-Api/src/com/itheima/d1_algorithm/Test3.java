package com.itheima.d1_algorithm;

import java.util.Arrays;

//目标：掌握二分查找算法
public class Test3 {
    public static void main(String[] args) {
        //1.准备好一个数组
        int []arr={7,23,79,81,103,127,131,147};

        System.out.println(binarySearch(arr, 81));
        //java中运用二分查找方法的Arrays类的方法
        System.out.println(Arrays.binarySearch(arr, 81));


    }

    public static int binarySearch(int []arr,int data)
    {
        //1.定义两个遍量，一个站在左边位置，一个站在右边位置
        int left=0;
        int right=arr.length-1;

        //2.定义一个循环控制折半
        while(left<=right)
        {
            //3.每次折半，都算出中间位置处的索引
            int middle=(left+right)/2;
            //4.判断当前要找的元素值，与中间位置处的元素值的大小情况
            if(data<arr[middle]){
                right=middle-1;//从左边找 截止位置=中间位置-1
            }else if(data>arr[middle])
            {
                left=middle+1;//从右边找 起始位置=中间位置+1
            }
            else{
                //中间位置处的元素值，正好等于我们要找的元素值
                return middle;
            }
        }

        //循环结束没有找到数据
        System.out.println("没有该数据");

        return -1;//-1特殊结果，就代表没有找到数据，数组中不存在该数据
    }
}


