package com.itheima.d2_buffered_stream;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.*;

/**
 * 目标：观察原始流和缓冲流的性能
 * */
public class TimeTest4 {
    //复制的视频路径
    private static final String SRC_FILE="D:/resource/1.mp4";
    //复制到哪个目的地
    private static final String DEST_FILE="D:/";

    public static void main(String[] args) {
        //copy01();
        copy02();
        copy03();
        copy04();

    }

    private static void copy01(){
        long startTime=System.currentTimeMillis();
        try(
                InputStream is=new FileInputStream(SRC_FILE);
                OutputStream os=new FileOutputStream(DEST_FILE+"1.MP4");

                ){
            int b;
            while((b=is.read())!=-1){
                os.write(b);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("低级字节流一个一个字节复制耗时:" + (endTime - startTime) / 1000.0 + "s");
    }

    private static void copy02(){
        long startTime=System.currentTimeMillis();
        try(
                InputStream is=new FileInputStream(SRC_FILE);
                OutputStream os=new FileOutputStream(DEST_FILE+"2.MP4");

        ){
            byte[]buffer=new byte[1024];//1kb
            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("低级字节流使用字节数组复制耗时:" + (endTime - startTime) / 1000.0 + "s");
    }

    private static void copy03(){
        long startTime=System.currentTimeMillis();
        try(
                InputStream is=new FileInputStream(SRC_FILE);
                BufferedInputStream bis= new BufferedInputStream(is);
                OutputStream os=new FileOutputStream(DEST_FILE+"3.MP4");
                BufferedOutputStream bos=new BufferedOutputStream(os)

        ){
            int b;
            while((b=bis.read())!=-1){
                bos.write(b);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("缓冲流一个一个字节复制耗时:" + (endTime - startTime) / 1000.0 + "s");
    }

    private static void copy04(){
        long startTime=System.currentTimeMillis();
        try(
                InputStream is=new FileInputStream(SRC_FILE);
                BufferedInputStream bis=new BufferedInputStream(is);
                OutputStream os=new FileOutputStream(DEST_FILE+"4.MP4");
                BufferedOutputStream bos=new BufferedOutputStream(os);

        ){
            byte[]buffer=new byte[1024];//1kb
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("缓冲流使用字节数组复制耗时:" + (endTime - startTime) / 1000.0 + "s");
    }


}
