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

        File file = new File(MainTest.class.getResource("services").getFile());

        System.out.println(file.isDirectory());

        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        Iterator<MyService> iterator = myServices.iterator();
        while (iterator.hasNext()) {
            MyService service = iterator.next();
            service.service();
        }
    }
}
