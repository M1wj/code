package com.itheima.loof;

public class ForDemo2 {
    public static void main(String[] args) {
        //目标：掌握for循环批量生产数据
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
        }

        System.out.println("---------------");
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("------------");
        //求一到一百的奇数和
        int sumji=0;
        for (int i = 1; i <=100 ; i+=2/*i=i+2*/) {
            sumji+=i;
        }
        System.out.println(sumji);

        System.out.println("------------------");
        int sum1=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){//i%2==1
                sum1+=i;
            }
        }
        System.out.println(sum1);
    }
}
