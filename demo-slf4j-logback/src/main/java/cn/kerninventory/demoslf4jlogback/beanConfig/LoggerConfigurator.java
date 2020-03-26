package cn.kerninventory.demoslf4jlogback.beanConfig;

import ch.qos.logback.classic.BasicConfigurator;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.layout.TTLLLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;

/**
 * @author Kern
 * @date 2020/3/26 10:04
 * @description 继承BasicConfigurator对logback 进行配置，这将比xml配置文件具有更好的性能
 * 需要使用serviceLoader机制，在build中的META-INF的service文件夹下有一个
 */
public class LoggerConfigurator extends BasicConfigurator {

    /**
     * 1.logback 会在类路径下寻找名为 logback-test.xml 的文件。
     * 2.如果没有找到，logback 会继续寻找名为 logback.groovy 的文件。
     * 3.如果没有找到，logback 会继续寻找名为 logback.xml 的文件。
     * 4.如果没有找到，将会通过 JDK 提供的 ServiceLoader 工具在类路径下寻找文件 META-INFO/services/ch.qos.logback.classic.spi.Configurator，该文件的内容为实现了 Configurator 接口的实现类的全限定类名。
     * 5.如果以上都没有成功，logback 会通过 BasicConfigurator 为自己进行配置，并且日志将会全部在控制台打印出来。
     * @param lc
     */
    public void configure(LoggerContext lc) {
        this.addInfo("Setting up default configuration.");
        ConsoleAppender<ILoggingEvent> ca = new ConsoleAppender();
        ca.setContext(lc);
        ca.setName("console");
        LayoutWrappingEncoder<ILoggingEvent> encoder = new LayoutWrappingEncoder();
        encoder.setContext(lc);
        TTLLLayout layout = new TTLLLayout();
        layout.setContext(lc);
        layout.start();
        encoder.setLayout(layout);
        ca.setEncoder(encoder);
        ca.start();
        Logger rootLogger = lc.getLogger("ROOT");
        rootLogger.setLevel(Level.WARN);
        rootLogger.addAppender(ca);
    }

}
