package cn.kerninventor.websocketdemo.springserverendpoint;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title WebSocketServerEp
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.websocketdemo.endpoint
 * @Author Kern
 * @Date 2020/1/14 15:00
 * @Description TODO
 */
@ServerEndpoint("/ws/endpoint/{gameCode}")
@Component
public class WebSocketServerEp {

    public static Map<String, Session> sessionMap = new HashMap<>(16);

    @OnOpen
    public void onOpen(Session session, @PathParam("gameCode") String gameCode) {
        System.out.println("endpoint 连接成功： " + gameCode);
        sessionMap.put(gameCode, session);
    }

    @OnMessage
    public void onMessage(String gameCode, Session session) {
        System.out.println("endpoint 收到来自客户端的消息： " + gameCode);
        try {
            session.getBasicRemote().sendText("endpoint ： hello web socket");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnClose
    public void onClose(Session session, @PathParam("gameCode") String gameCode) {
        System.out.println("endpoint 断开连接： " + gameCode);
        sessionMap.remove(gameCode, session);
    }

}
