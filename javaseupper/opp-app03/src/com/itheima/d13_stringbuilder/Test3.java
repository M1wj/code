package com.itheima.d13_stringbuilder;

public class Test3 {
    public static void main(String[] args) {
        //目标；完成数组遍历内容，拼接字符串
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }
    public static String getArrayData(int []arr)
    {
        //判断是否为空
        if(arr==null)
            return null;

        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }
            else
            {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
