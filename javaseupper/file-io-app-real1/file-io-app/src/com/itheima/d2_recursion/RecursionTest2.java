package com.itheima.d2_recursion;
/**
 *目标：掌握递归的应用，执行流程和算法思想
 * */
public class RecursionTest2 {
    public static void main(String[] args) {
        System.out.println("5的阶乘时"+f(5));
        System.out.println("1-6的和" + sum(6));

    }

    public static int sum(int n){
        //求1-n的和
        if(n==1){
            return 1;
        }
        else{
            return sum(n-1)+n;
        }
    }

    public static int f(int n)
    {
        //终结点
        if(n==1){
            return 1;
        }
        else{
            return f(n-1)*n;
        }
    }

}
