package cn.kerninventor.websocketdemo.springwshandler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @Title: WebSocketConfig
 * @ProjectName demos
 * @PackageName cn.kerninventor.websocketdemo.handler
 * @Author Kern
 * @Date 2020/1/9 23:49
 * @Description: TODO
 */
@Configuration
@EnableWebSocket
public class WebSocketConfigHd implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(refreshPageWsServer(), "/ws/handler/{gameCode}");
    }

    public org.springframework.web.socket.WebSocketHandler refreshPageWsServer(){
        return new WebSocketHandler();
    }
}
