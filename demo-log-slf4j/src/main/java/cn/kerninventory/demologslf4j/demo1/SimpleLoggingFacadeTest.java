package cn.kerninventory.demologslf4j.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kern
 * @date 2020/3/20 16:09
 * @description TODO
 */
public class SimpleLoggingFacadeTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("demo");
        logger.info("Hello Slf4j !");
    }
}
