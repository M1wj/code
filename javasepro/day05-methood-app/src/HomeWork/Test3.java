package HomeWork;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个数:");
        double a= sc.nextDouble();
        System.out.println("该数的绝对值为：");
        System.out.println(a);
    }

    public static double jdz(double a)
    {
        if(a==0.0)
        {
            return 0.0;
        }
        if(a<0)
        {
            return (-1.0)*a;
        }
        return a;
    }
}
