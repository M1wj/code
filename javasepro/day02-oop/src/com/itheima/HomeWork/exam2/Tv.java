package com.itheima.HomeWork.exam2;

public class Tv {
    private String name;

    public Tv() {
    }

    public Tv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play(String channel){
        System.out.println(name + "电视正在播放" + channel + "节目");
    }
}
