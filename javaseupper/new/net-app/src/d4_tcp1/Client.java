package d4_tcp1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 目标：完成TCP通信快速入门-客户端开发：实现1发1收
 * */
public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建Socket对象，并同时请求与服务端程序的连接
        Socket socket=new Socket("192.168.141.1",8888);

        //2.从socket通信管道中得到一个字节输出流，用来发数据给服务端程序
        OutputStream os=socket.getOutputStream();

        //3.把低级的字节输出流包装成数据输出流
        DataOutputStream dos=new DataOutputStream(os);

        //4.开始写数据出去了
        dos.writeUTF("在一起好吗？");
        dos.close();


    }
}
