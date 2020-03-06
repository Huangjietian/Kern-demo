package cn.kerninventor.websocketdemo.springwshandler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.websocket.server.PathParam;
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
public class WebSocketHandler extends TextWebSocketHandler {

    private Map<String, WebSocketSession> sessionMap = new ConcurrentHashMap<>(16);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        //连接完成后
        super.afterConnectionEstablished(session);

        Map<String, Object> map = session.getAttributes();
        System.out.println("handler 连接成功： " + map.get("gameCode"));
        sessionMap.put((String) map.get("gameCode"), session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        System.out.println("handler 收到来自客户端的消息： " + message.getPayload());
        session.sendMessage(new TextMessage("handler ： hello web socket"));
    }


    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        super.handleTransportError(session, exception);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
        System.out.println("endpoint 断开连接： " + session.getAttributes().get("gameCode"));
        sessionMap.remove(session.getAttributes().get("gameCode"), session);
    }
}
