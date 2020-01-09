package cn.kerninventor.websocketdemo.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
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
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(refreshPageWsServer(), "/ws/refresh");
    }

    public WebSocketHandler refreshPageWsServer(){
        return new RefreshPageWsHandler();
    }
}
