package cn.kerninventory.demoslf4jlog4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kern
 * @date 2020/3/27 11:35
 * @description TODO
 */
public class MainTest {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(MainTest.class);
        logger.error("HELLO LOG4J2");
    }
}
