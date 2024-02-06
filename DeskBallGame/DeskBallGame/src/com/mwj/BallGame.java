package com.mwj;

import javax.swing.*;

public class BallGame extends JFrame {

    //设置窗口
    public void launch(){
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口大小
        this.setSize(856,501);
        //设置窗口的位置
        this.setLocation(100,200);
        //设置窗口标题
        this.setTitle("桌球小游戏");
    }




    public static void main(String []args){
        BallGame bg=new BallGame();
        bg.launch();
    }

}
