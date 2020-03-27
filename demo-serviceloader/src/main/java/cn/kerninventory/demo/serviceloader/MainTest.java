package cn.kerninventory.demo.serviceloader;

import java.io.File;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author Kern
 * @date 2020/3/23 19:44
 * @description TODO
 */
public class MainTest {
    public static void main(String[] args) {
        ServiceLoader.loadInstalled(MyService.class);
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        Iterator<MyService> iterator = myServices.iterator();
        while (iterator.hasNext()) {
            MyService service = iterator.next();
            service.service();
        }
    }
}
