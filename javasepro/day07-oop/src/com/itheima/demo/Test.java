package com.itheima.demo;

import java.util.Scanner;

import static java.lang.System.exit;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
//        Movie m1=new Movie("水门桥",1,38.9,9.8,"徐克","吴京","12万人想看");
//        Movie m2=new Movie("出拳吧",2,39,7.8,"唐晓白","田雨","3.5万人想看");
//        Movie m3=new Movie("月球陨落",3,42,7.9,"罗兰","贝瑞","17.9万人想看");
//        Movie m4=new Movie("一点就到家",4,35,8.7,"许宏宇","刘昊然","10.8万人想看");
//        movies[0]=m1;
//        movies[1]=m2;
//        movies[2]=m3;
//        movies[3]=m4;
        //以上代码可优化为：
        movies[0] = new Movie("水门桥", 1, 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movies[1] = new Movie("出拳吧", 2, 39, 7.8, "唐晓白", "田雨", "3.5万人想看");
        movies[2] = new Movie("月球陨落", 3, 42, 7.9, "罗兰", "贝瑞", "17.9万人想看");
        movies[3] = new Movie("一点就到家", 4, 35, 8.7, "许宏宇", "刘昊然", "10.8万人想看");

       MovieOperator m=new MovieOperator(movies);
//        m.printAllMovies();
//        m.searchMovieById(7);

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("----------------");
            System.out.println("=====欢迎使用电影系统=====");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询某个电影的详细信息");
            System.out.println("3.退出");
            System.out.println("请输入您的操作命令");
            int commod=sc.nextInt();
            switch(commod)
            {
                case 1:
                    //展示全部信息
                    m.printAllMovies();
                    break;
                case 2:
                    //根据id查询某个电影的详细信息
                    System.out.println("请输入您要查询的id");
                    int id= sc.nextInt();
                    m.searchMovieById(id);
                    break;
                case 3:
                    System.out.println("退出");
                    //break;
                    exit(1);

                default:
                    System.out.println("您输入的命令有误~~~");
                    break;

            }
            return;

        }
    }
}
