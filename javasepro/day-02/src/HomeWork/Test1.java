package HomeWork;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入父亲的身高：");
        double father= sc.nextDouble();
        System.out.println("请输入母亲的身高：");
        double mother=sc.nextDouble();
        double son=(father+mother)*1.08/2;
        double daughter=(father*0.923+mother)/2;

        System.out.println("儿子身高为：" + son + "女儿身高为：" + daughter);
    }
}
