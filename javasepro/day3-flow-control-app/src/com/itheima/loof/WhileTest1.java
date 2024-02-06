package com.itheima.loof;

public class WhileTest1 {
    //需求:世界最高山峰珠穆朗玛峰高度是:8848.86米=8848860毫米，
    // 假如我有一张足够大的纸，它的厚度是0.1毫米。
    // 请问:该纸张折叠多少次，可以折成珠穆朗玛峰的高度?
    public static void main(String[] args) {
        double peakheight=8848860;
        double paperheight=0.1;

        int cout=0;
        while(paperheight<peakheight)
        {
            paperheight=paperheight*2;
            cout++;
        }
//        for(;paperheight<peakheight;)
//        {
//            paperheight=paperheight*2;
//            cout++;
//        }
        System.out.println("循环了" + cout + "次当前厚度为" + paperheight);

    }
}
