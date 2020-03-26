package cn.kerninventory.demo.serviceloader;

/**
 * @author Kern
 * @date 2020/3/23 19:44
 * @description TODO
 */
public interface MyService {

    default void service() {
        System.out.println(this.getClass().toString());
    }
}
