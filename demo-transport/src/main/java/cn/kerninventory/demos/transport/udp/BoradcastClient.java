package cn.kerninventory.demos.transport.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BoradcastClient{


    public static void main(String[] args)throws IOException {
        String host = "255.255.255.255";//广播地址
        int port = 9999;//广播的目的端口
        String message = "hello guoye";//用于发送的字符串
        try{
            InetAddress adds = InetAddress.getByName(host);
            DatagramSocket ds = new DatagramSocket();
            DatagramPacket dp = new DatagramPacket(message.getBytes("UTF-8"),message.length(), adds, port);
            ds.send(dp);
            ds.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}