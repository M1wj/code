package com.itheima;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 目标：使用CommonsIO框架进行IO相关的操作
 * */
public class CommonsIOTest1 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("io-app2/src/itheima01.txt"),new File("io-app2/src/a.txt"));

        //java提供的原生的一行代码搞定很多事情
        //Files.copy(Path.of("io-app/src/itheima01.txt"),Path.of("io-app2/src/b.txt"));
        System.out.println(Files.readString(Path.of("io-app2/src/itheima01.txt")));
    }
}
