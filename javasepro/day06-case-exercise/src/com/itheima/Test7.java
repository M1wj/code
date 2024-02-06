package com.itheima;

public class Test7 {
    public static void main(String[] args) {
        //找素数案例
//        int count=search(101,200);
//        System.out.println(count+"个");
        //以上代码可优化为：
        System.out.println("当前素数的个数为：" + search(101, 200));
    }

    public static int search(int start,int end)
    {
        int count=0;
        for(int i=start;i<=end;i++)
        {
            boolean flag=true;//默认为素数

            //判断是否为素数
            for(int j=2;j<i/2;j++)
            {
                 if(i%j==0){
                     //i当前所记录数据不是素数
                     flag=false;
                     break;

                 }
            }
            if(flag==true)
            {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
