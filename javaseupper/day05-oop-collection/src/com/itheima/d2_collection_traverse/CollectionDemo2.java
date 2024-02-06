package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

/**

    目标：Collection集合的遍历方式二 ： 增强for
    格式：for(数据类型 变量名 ： 数组或集合 )
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);
        // c=[赵敏 小昭 素素 灭绝]

        //使用增强for遍历集合或者数组
        // 集合对象或者数组名 .for可迅速写出
        for(String ele : c){
            System.out.println(ele);
        }

        String []names={"迪丽热巴","古力娜扎","稀奇哈哈"};
        for(String name:names){
            System.out.println(name);
        }
    }
}
