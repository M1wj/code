package HomeWork;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入第一个和尚的身高：");
        int one=sc.nextInt();

        System.out.println("请输入第二个和尚的身高：");
        int two=sc.nextInt();

        System.out.println("请输入第三个和尚的身高：");
        int three=sc.nextInt();

        int temp;
        temp=one>two? one:two;
        int max;
        max=temp>three? temp:three;

        System.out.println("这三个和尚身高最高的是："+max);
    }
}
