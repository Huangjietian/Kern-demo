package cn.kerninventor.websocketdemo.handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.websocket.Session;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title: RefreshPageWsServer
 * @ProjectName demos
 * @PackageName cn.kerninventor.websocketdemo.handler
 * @Author Kern
 * @Date 2020/1/9 23:56
 * @Description: TODO
 */
public class RefreshPageWsHandler extends TextWebSocketHandler {

    private Map<String, WebSocketSession> sessionMap = new ConcurrentHashMap<>(16);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        //连接完成后
        super.afterConnectionEstablished(session);
        sessionMap.put(session.getId(), session);

        System.out.println("建立连接:" + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        String payloadContext = message.getPayload();
        System.out.println(payloadContext);
        session.sendMessage(new TextMessage("收到"));
    }
    public void refreshMessagePush(){

    }


    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        super.handleTransportError(session, exception);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
        sessionMap.remove(session.getId());
        System.out.println("断开连接:" + session.getId());
    }
}
