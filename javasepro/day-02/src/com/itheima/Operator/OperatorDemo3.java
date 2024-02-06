package com.itheima.Operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：掌握拓展赋值运算符
        //+=
        //收红包
        double a=9.5;
        double b=520;
        a+=b;//a=double(a+b);其中隐含了强制类型转换
        System.out.println(a);

        //-=
        //发红包
        double i=600;
        double j=520;
        i-=j;//i=douible(i-j);
        System.out.println(i);

        int m=10;
        int n=5;
        //m*=n;//等价形式：m=(int)(m*n);
        //m/=n;//等价形式：m=(int)(m/n);
        m%=n;//等价形式：m=(int)(%*n);
        System.out.println(m);


        System.out.println("-------------------------------------------------");

        byte x=10;
        byte y=30;
        //x=x+y;//编译报错
        //x=(byte)(x+y);
        x+=y;//等价形式x=(byte)(x+y);
        System.out.println(x);


    }
}
