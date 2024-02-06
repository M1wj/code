package HomeWork;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        double ysrs=24;
        double yzhsm=8;
        double mf=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入买的鱼香肉丝的分数：");
        int x=sc.nextInt();
        System.out.println("请输入买的油炸花生的分数：");
        int y=sc.nextInt();
        System.out.println("请输入买的米饭的分数：");
        int z=sc.nextInt();
        double firstmoney=ysrs*x+yzhsm*y+mf*z;
        double money=firstmoney>100? (0.9*firstmoney) : firstmoney;

        System.out.println(money);
    }
}
