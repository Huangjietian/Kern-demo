package cn.kerninventory.demos.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class LqSocketSender {

    public static void main(String[] args) throws IOException {
        for (int i = 0 ; i < 1000 ; i ++) {
            final int index = i;
            new Thread(() -> {
                try {
                    Socket socket = new Socket(InetAddress.getLocalHost(), 6000);
                    OutputStream os = socket.getOutputStream();
                    String message = "你好" + index;
                    os.write(message.getBytes("UTF-8"));
                    os.flush();
                    socket.shutdownInput();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
