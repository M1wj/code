package d2_upd1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 目标：完成UDP通信快速入门，实现一发一收
 * */
public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建客户端对象（发韭菜出去的人）
        DatagramSocket socket=new DatagramSocket();

        //2.创建数据包对象封装要发出去的数据（创建一个韭菜盘子）
        //public DatagramPacket(byte buf[], int length,
        //                          InetAddress address, int port) {
        //        this(buf, 0, length, address, port);
        /**
         * 参数一：封装要发出去的数据
         * 参数二：发送出去的数据大小
         * 参数三：服务端的IP地址（找到服务端主机）
         * 参数四：服务端程序的端口
         * */
        byte []bytes="我是快乐的客户端，我爱你abc".getBytes();
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length
        , InetAddress.getLocalHost(),6666);

        //3.开始正式发送这个数据包的数据出去了
        socket.send(packet);

        System.out.println("客服端数据发送完毕");
        socket.close();//释放资源
    }
}
