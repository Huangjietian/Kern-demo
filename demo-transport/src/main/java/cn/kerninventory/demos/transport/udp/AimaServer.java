package cn.kerninventory.demos.transport.udp;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class AimaServer {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(4444);

        while (true) {
            byte[] bytes = new byte[4096];
            DatagramPacket packet = new DatagramPacket(bytes, 4096);
            socket.receive(packet);
            String message = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(message);
            new Thread(() -> {
                for (int i = 0 ; i < 1000 ; i ++) {
                    new Thread(() -> {
                        JOptionPane.showMessageDialog(null, message, "服务", JOptionPane.ERROR_MESSAGE);
                    }).start();
                }
            }).start();
        }
    }

}
