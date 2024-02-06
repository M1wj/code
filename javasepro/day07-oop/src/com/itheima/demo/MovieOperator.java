package com.itheima.demo;

public class MovieOperator {
    private  Movie []movies;
    public  MovieOperator()
    {

    }
    public MovieOperator(Movie[]movies)
    {
        this.movies=movies;
    }
    //展示全部电影信息
    public void printAllMovies()
    {
        System.out.println("------全部电影信息如下--------");
        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println("-------------");
        }
    }

    public void searchMovieById(int id)
    {
        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            if(m.getId()==id){
                System.out.println("该电影详情如下");
                System.out.println("名称：" + m.getName());
                System.out.println("价格：" + m.getPrice());
                System.out.println("主演：" + m.getActor());
                System.out.println("导演：" + m.getDirector());
                System.out.println("评分：" + m.getScore());
                System.out.println("其他：" + m.getInfo());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
