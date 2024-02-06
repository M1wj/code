package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //双色球系统的开发
        int []userNumbers=userSelectNumbers();
        System.out.println("您投注的号码");
        printArray(userNumbers);
        int []luckNumbers=createLuckNumbers();
        System.out.println("中奖号码：");
        printArray(luckNumbers);
        System.out.println("您的中奖情况：");
        judge(userNumbers,luckNumbers);


    }
    public static void printArray(int []ar)
    {
        System.out.print("[");
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(i == ar.length - 1 ? ar[i] : ar[i] + ",");

        }
        System.out.print("]");
    }

    //1.用于用户投注一组号码（前6个是红球，最后一个为蓝球），并返回用户投注的号码
    public static int [] userSelectNumbers()
    {
        //创建一个整型数组储存号码：
        int []numbers=new int[7];
        Scanner sc=new Scanner(System.in);

        //先输入6个红球号码 1-33之间不能重复
        for (int i = 0; i < numbers.length-1 ; i++) {
            while (true) {
                System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33之间，不能重复）：");
                int number=sc.nextInt();

                //判断用户输入是否合法
                if(number<1||number>33)
                {
                    System.out.println("输入不合法");
                }
                else
                {
                    //判断是否重复
                    if(exsit(numbers,number)){
                        System.out.println("对不起重复了");
                    }
                    else{
                        numbers[i]=number;//成功投注
                        break;//结束当此死循环
                    }
                }
            }
        }
        //投注篮球号码
        while (true) {
            System.out.println("请输入篮球号码");
            int number=sc.nextInt();
            if(number<1||number>16){
                System.out.println("对不起输入有误");
            }
            else{
                numbers[6]=number;
                break;//蓝球号码投注成功结束死循环
            }
        }
        return numbers;

    }

    //判断是否重复
    public static boolean exsit(int []numbers,int number) {

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==0)
            {
                return false;
            }
            if(numbers[i]==number )
            {
                return true;
            }
        }
        return false;
    }

    //1.系统随机一组中奖号码（前6个是红球，最后一个为蓝球），并返回这组中奖的号码
        public static int [] createLuckNumbers()
    {
            Random r=new Random();
            int []luckyNumbers=new int[7];
            //随机产生红球号码

                for(int i=0;i< luckyNumbers.length-1;i++)
                {
                    while (true) {
                        int index=r.nextInt(33)+1;
                        if(!exsit(luckyNumbers,index))
                        {
                           luckyNumbers[i]=index;
                           break;
                         }
                    }
                }


            //随机产生篮球号码
        luckyNumbers[6]=r.nextInt(16)+1;

        return luckyNumbers;


    }

    //1.传入两组号码并判断用户号码的中奖情况（前6个是红球，最后一个为蓝球），并给出结果
    public static void judge(int []userNumbers,int [] luckNumbers)//用户投注号码和随机中奖号码
    //userNumbers=[12,14,16,18,23,26,8]
    //luckNumbers=[16,17,18,26,32,19,8]
    {
        //分别定义两个变量来记录红球命中数和篮球命中数
        int redCount=0;
        int blueCount=0;

        //先判断红球命中个数
        for (int i = 0; i <userNumbers.length-1 ; i++) {
            for(int j=0;j<luckNumbers.length-1;j++)
            {
                if(userNumbers[i]==luckNumbers[j])
                {
                    redCount++;
                    break;//命中后开始找下一个
                }
            }
        }

        //判断篮球命中个数
//        if(userNumbers[6]==luckNumbers[6])
//        {
//            blueCount++;
//        }
        //以上代码可写为
        blueCount=userNumbers[6]==luckNumbers[6]?1:0;
        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的篮球数量是：" + blueCount);

        //判断中奖详情并输出
        if(redCount==6&&blueCount==1)
        {
            System.out.println("恭喜中奖1000万");
        }
        else if(redCount==6&&blueCount==0)
        {
            System.out.println("恭喜中奖500万");
        }
        else if(redCount==5&&blueCount==1)
        {
            System.out.println("恭喜中奖3000元");
        }
        else if(redCount==5&&blueCount==0||redCount==4&&blueCount==1)
        {
            System.out.println("恭喜中奖200元");
        }
        else if(redCount==4&&blueCount==0||redCount==3&&blueCount==1)
        {
            System.out.println("恭喜中奖10元");
        }
        else if(redCount<3&&blueCount==1)
        {
            System.out.println("恭喜中奖5元");
        }
        else{
            System.out.println("感谢您对福利事业做出的贡献");
        }



    }
}
