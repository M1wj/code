package d6_tcp3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：完成TCP通信快速入门-服务端开发：实现
 * */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务端启动-------------");
        //1.创建ServerSocket的对象，同时为服务端注册端口
        ServerSocket serverSocket=new ServerSocket(8888);

        while (true) {
            //2.使用ServerSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket= serverSocket.accept();

            System.out.println("有人上线了"+socket.getRemoteSocketAddress());

            //3.把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();

        }


    }
}
