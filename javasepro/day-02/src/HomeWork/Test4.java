package HomeWork;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int tiger1=sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int tiger2=sc.nextInt();
        String sr=tiger1==tiger2? "两只老虎体重相同" :"两只老虎体重不同";
        System.out.println(sr);

    }
}
