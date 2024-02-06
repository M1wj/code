package d2_upd1;

import javax.xml.crypto.Data;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 目标：完成UDP通信快速入门-服务端开发
 * */
public class Server {
    public static void main(String[] args) throws Exception {
        //1.创建一个服务端对象（创建一个接韭菜的人）注册端口
        DatagramSocket socket=new DatagramSocket(6666);

        //2.创建一个数据包对象，用于接收数据的（创建一个韭菜盒子）
        byte[]buffer=new byte[1024*64];//64KB
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);

        //3.开始正式使用数据包来接受客户端发来的数据
        socket.receive(packet);

        //4.从字节数组中，把接受的数据直接打印出来
        //接受多少就倒出多少
        //获取本次数据包接受了多少数据
        int len=packet.getLength();
        String rs=new String(buffer,0,len);
        System.out.println(rs);

        //客户端地址
        System.out.println(packet.getAddress().getHostAddress());
        //客户端端口
        System.out.println(packet.getPort());
        socket.close();//释放资源

    }
}
