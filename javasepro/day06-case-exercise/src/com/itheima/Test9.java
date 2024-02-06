package com.itheima;

public class Test9 {
    public static void main(String[] args) {
        /*
        int 4;行数为4
        * 行（i）      先打空格（n-i）    再打* 换行（2i-1）
        * 1           3                  1
        * 2           2                  3
        * 3           1                  5
        * 4           0                  7

*/
        int n=10;
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print(j % 2 == 0 ? " " : "*");
            }
            System.out.println();
        }
    }
}
