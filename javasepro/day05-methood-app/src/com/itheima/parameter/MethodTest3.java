package com.itheima.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        //目标：完成打印int 类型的数组内容
        int []arr={13,17,25,39};
        printf(arr);

//        int []arr2=null;
//        printf(arr2);为空会报错

    }
    public static void printf(int []args){
        if(args==null){
            System.out.println(args);
            return;//跳出当前方法
        }

        System.out.print("[");
        for(int i=0;i< args.length;i++)
        {
//            if(i== args.length-1)
//            {
//                System.out.print(args[i]);
//            }
//            else
//            System.out.print(args[i]+", ");
            System.out.print(i== args.length-1?args[i]:args[i]+", ");
        }
        System.out.print("]");
    }
}
