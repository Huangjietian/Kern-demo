package cn.kerninventor.websocketdemo.springserverendpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Title WebSocketConfig
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.websocketdemo.endpoint
 * @Author Kern
 * @Date 2020/1/14 15:00
 * @Description TODO
 */
@Configuration
public class WebSocketConfigEp {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
