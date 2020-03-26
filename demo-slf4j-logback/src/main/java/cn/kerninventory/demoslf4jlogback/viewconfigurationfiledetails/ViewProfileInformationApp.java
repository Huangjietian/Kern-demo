package cn.kerninventory.demoslf4jlogback.viewconfigurationfiledetails;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kern
 * @date 2020/3/26 10:30
 * @description  打印查看配置xml文件信息
 */
public class ViewProfileInformationApp {

    public static final Logger LOGGER = LoggerFactory.getLogger(ViewProfileInformationApp.class);

    /**
     * 打印配置文件的三种形式
     * 1. 获得工厂类强转为上下文LoggerContext，调用StatusPrinter.print(context)打印
     * 2. 配置文件中root.level=debug
     * 3. 配置文件中<statusListener class="ch.qos.logback.core.status.OnConsoleStatusListener" />
     *
     * @param args
     */
    public static void main(String[] args) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        LOGGER.warn("Entering application.");
        /**
         * something to do!!!
         */
        LOGGER.warn("Exiting application.");
    }
}
