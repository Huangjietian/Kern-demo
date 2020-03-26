package cn.kerninventory.demoslf4jlogback.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kern
 * @date 2020/3/26 15:36
 * @description TODO
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("")
    public String toLogging() throws InterruptedException {
        logger.info("logging start!");

        for (int i = 0 ; i < 500; i++) {
            logger.info("PC {}", i);
            if ((i & 3) == 0) {
                logger.warn("i={},i & 3 == 0", i);
            }
            if ((i & 5) == 0) {
                logger.error("i={},i & 5 == 0", i);
            }
            Thread.currentThread().sleep(300);
        }
        logger.info("logging end!");

        return "Hello logback!";
    }
}
