package cn.kerninventory.demoslf4jlog4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kern
 * @date 2020/4/23 17:52
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("")
    public String test() {
        try {
            logger.info("请求信息 ： xxxx");
            if (!authentication()) {
                logger.warn("警告，非法访问！！！");
                throw new Exception("非法访问！！!");
            }
            doingSomething();
            logger.info("请求处理结束!");
        } catch (Exception e) {
            logger.error("test error ! === {}", e.getMessage() , e);
            e.printStackTrace();
        }
        return "success!";
    }

    private boolean authentication(){
        return false;
    }

    private void doingSomething(){
        //NOTHING TO DO !
    }

}
