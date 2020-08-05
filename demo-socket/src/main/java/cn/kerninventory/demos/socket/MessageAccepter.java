package cn.kerninventory.demos.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class MessageAccepter {

    private ServerSocket serverSocket;


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6000);
        Socket socket;
        int count = 0;
        while (true) {
            socket = serverSocket.accept();
            InputStream is = socket.getInputStream();

            //防止因网络异常导致的空读
            int waitCount = 0;
            int available;
            while ((available = is.available()) == 0 && waitCount < 100) {
                waitCount ++ ;
            }
            if (available == 0) {
                return;
            }

            byte[] bytes = new byte[available];
            is.read(bytes, 0, available);
            String message = new String(bytes, "UTF-8");
            System.out.println("收到消息[" + (++count) + "] ->" + message + "  Client: " + socket.getLocalAddress().getHostAddress() + socket.getLocalPort());

            //关闭流
            socket.shutdownInput();
            socket.close();
        }
    }
}