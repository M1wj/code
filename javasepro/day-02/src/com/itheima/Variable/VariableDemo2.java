package com.itheima.Variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标：掌握常见的基本数据类型使用
        //1.byte，shot，long
        byte a=127;//-128~127
        //byte a=128;越界了

        short s=13234;
        //short s1=97347826;越界了

        int i=422424;//默认

        //注意：如果随便写一个整型字面量默认是int类型的，42242444444虽然没有超过long的范围但是超过了int的范围
        //如果希望随便写一个整型字面量默认为long类型的，需要在后面加上L或l
        long lg=42242444444L;

        //2.float double
        //注意：随便写小数字面量默认为double，想要默认为float要在其后加上F或f
        float f=3.14F;
        double d=64.24;

        //3.字符型
        char ch='a';
        char ch1='中';
        //char定义变量必须有且仅有一个字符不可为空 char ch='';会报错

        //4.布尔型
        boolean flag=true;
        boolean flag1=false;

        //拓展引用数据类型
        //String称之为字符串类型，定义的变量可以储存字符串类型
        String name="张三";
        System.out.println(name);


    }
}
