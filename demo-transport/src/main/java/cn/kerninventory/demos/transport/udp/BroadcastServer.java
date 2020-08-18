package cn.kerninventory.demos.transport.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BroadcastServer {

    public static void main(String[] args) throws IOException {

        int port = 9999;//开启监听的端口
        DatagramSocket ds = new DatagramSocket(port);

        while (true) {
            byte[] bytes = new byte[1024];//存储发来的消息
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            String message = new String(bytes, "UTF-8");
            System.out.println("MESSAGE: " + message);
        }
    }
}