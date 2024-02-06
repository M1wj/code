package HomeWork;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int x=sc.nextInt();
        int gewei=x%10;
        int shiwei=(x%100-gewei)/10;
        int baiwei=(x%1000-gewei-shiwei)/100;
        int qianwei=(x-gewei-baiwei-shiwei)/1000;
        System.out.println("个位：" + gewei + "十位：" + shiwei + "百位：" + baiwei + "千位：" + qianwei);
        /*
        //1.定义int变量num,并初始化
        int num = 5678;
        //2.计算个位,十位,百位,千位分别保存int变量ge,shi,bai,qian中
        //计算个位
        int ge = num % 10;
        //计算十位
        int shi = num / 10 % 10;
        //计算百位
        int bai = num / 100 % 10;
        //计算千位
        int qian = num / 1000 % 10;
        //3.根据题目需求打印结果数据
        System.out.println(num + "的个位是" + ge + ",十位是" + shi + ",百位是" + bai + ",千位是" + qian);
        * */
    }
}
