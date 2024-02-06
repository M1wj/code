package com.itheima;

public class Test1 {
    public static void main(String[] args) {
        //目标：完成买飞机票的案例

        double money=calculate(1000,8,"经济舱");
        System.out.println(money);
    }

    public static double calculate(double price,int month,String type)
    {
        //判断当前为旺季还是淡季
        if(month>=5&&month<=10){
            //旺季
            switch(type){
                case "头等舱":
                    price=price*0.9;
                    break;
                case "经济舱":
                    price=price*0.85;
                    break;
            }
        }
        else{
            //淡季
            switch(type){
                case "头等舱":
                    price=price*0.7;
                    break;
                case "经济舱":
                    price=price*0.65;
                    break;
            }
        }
        return price;

    }
}
