package com.itheima.demo1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //目标：完成幸存者案例
        //1.定义一个ArrayList存储100个囚犯的随机编号
        List<Integer> peoples=new ArrayList<>();
        
        //2.依次存入100个1-200的随机的不重复的编号到集合中去
        Random r=new Random();
        for (int i = 1; i <=100 ; i++) {
            int code=r.nextInt(200)+1;
            //3.必须确保这个编号没有重复，我才存入到集合中去
            if(peoples.contains(code)){
                i--;
            }else{
                peoples.add(code);
            }
        }
        System.out.println(peoples);

        //注意把集合的数据复制一份
        List<Integer> peoplesBak=new ArrayList<>();
        peoplesBak.addAll(peoples);

        //4.删除奇数位置处的囚犯
        while (peoples.size()>1){
            //5.从集合的后面开始倒着删除集合的奇数位置
            for(int i=peoples.size()%2==0?peoples.size()-2:peoples.size()-1;i>=0;i-=2){
                peoples.remove(i);
            }
        }

        int code=peoples.get(0);
        System.out.println("幸存者编号" + code);

        int index=peoplesBak.indexOf(code);
        System.out.println("幸存者位置" + (index + 1));
    }
}
