package com.itheima.d6_abstract_template;

public abstract  class People {
    //1.定义一个模板方法
    public final void write()//加final防止方法被子类重写
    {
        System.out.println("\t\t\t\t\t《我的爸爸》");
        System.out.println("\t\t他很牛来看看");

        //2.模板方法不清楚正文写什么，但是一定知道子类肯定写的
        System.out.println(writeMain());

        System.out.println("有这样的爸爸真好！");
    }

    //3.设计一个抽象方法写正文，具体的实现交给子类实现
    public abstract String writeMain();
}
