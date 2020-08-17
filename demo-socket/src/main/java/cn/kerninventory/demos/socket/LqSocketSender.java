package cn.kerninventory.demos.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class LqSocketSender {

    public static void main(String[] args) throws IOException, InterruptedException {

        for (int j = 0 ; j < 1 ; j ++) {
            for (int i = 0 ; i < 1 ; i ++) {
                Socket socket = new Socket("172.20.2.18", 6000);
                OutputStream os = socket.getOutputStream();
                String message = "FPSTART,188,PScoreT,C,男,组,男子组5000米第1组,决赛,1,1,2020-08-03 17:03:45.673,5, 13,红色组,255,备注1,备注2,备注3,{1,5,6,魏仁杰,男,实验学校,0,f106c6140000000000000000,,{1,1:53.57,20200803170539234,0,备注1,备注2,备注3}},FPEND";
                byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
                os.write(bytes);
                os.flush();
//                os.write(bytes);
                os.flush();
                socket.shutdownOutput();
                socket.close();
            }
            Thread.sleep(100L);
        }



    }
}
