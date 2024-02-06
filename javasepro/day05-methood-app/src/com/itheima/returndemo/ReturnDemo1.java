package com.itheima.returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        //目标：掌握return；单独使用再无返回值方法中的使用：跳出并立即结束当前方法的执行
        chu(10,0);
    }

    public static void chu(int a,int b)
    {
        if(b==0){
            System.out.println("输入错误");
            return;
        }
        int c=a/b;
        System.out.println(c);
    }
}
