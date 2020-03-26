package cn.kerninventory.demoslf4jlogback.systemPropertyConfig;

import ch.qos.logback.classic.util.ContextInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kern
 * @date 2020/3/26 10:42
 * @description TODO
 */
public class SystemPropertyConfig {

    static {
        System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "configurationFile.xml");
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(SystemPropertyConfig.class);

    public static void main(String[] args) {
        LOGGER.info("通过修改系统属性的形式修改配置文件信息");
    }
}
