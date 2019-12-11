package cn.kerninventor.springloggerdemo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Title: Log4J2TestServer
 * @ProjectName demos
 * @PackageName cn.kerninventor.springloggerdemo.service
 * @Author Kern
 * @Date 2019/12/9 11:54
 * @Description: TODO
 */
@Service
public class Log4J2TestServer {

    private Logger logger = LogManager.getLogger(Log4J2TestServer.class);
}
