package cn.kerninventory.demos.transport.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class MarenClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet;
//        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = "国烨大帅逼";
            InetAddress adds = InetAddress.getByName("172.20.15.255");
            byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
            packet = new DatagramPacket(message.getBytes(StandardCharsets.UTF_8), bytes.length, adds, 4444);
            socket.send(packet);
//        }

    }
}
