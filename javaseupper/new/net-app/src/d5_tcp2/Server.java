package d5_tcp2;

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

        //2.使用ServerSocket对象，调用一个accept方法，等待客户端的连接请求
        Socket socket= serverSocket.accept();

        //3.从socket通信管道中得到一个字节输入流
        InputStream is=socket.getInputStream();

        //4.把原始的字节输入流包装成数据输入流
        DataInputStream dis=new DataInputStream(is);

        //5.使用数据输入流读取客户端发送过来的消息
        while (true) {
            try {
                String rs=dis.readUTF();
                System.out.println(rs);
            } catch (IOException e) {
                System.out.println(socket.getRemoteSocketAddress()+"离线了");
                dis.close();
                socket.close();
                break;
            }
        }


    }
}
