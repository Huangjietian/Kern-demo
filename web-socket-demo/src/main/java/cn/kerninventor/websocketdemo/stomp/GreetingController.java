package cn.kerninventor.websocketdemo.stomp;

import cn.kerninventor.websocketdemo.stomp.entity.Greeting;
import cn.kerninventor.websocketdemo.stomp.entity.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/**
 * @Title: GreetingController
 * @ProjectName demos
 * @PackageName cn.kerninventor.websocketdemo
 * @Author Kern
 * @Date 2020/1/6 21:51
 * @Description: TODO
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
