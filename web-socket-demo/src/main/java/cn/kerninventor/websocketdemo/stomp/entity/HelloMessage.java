package cn.kerninventor.websocketdemo.stomp.entity;

/**
 * @Title: HelloMessage
 * @ProjectName demos
 * @PackageName cn.kerninventor.websocketdemo.stomp.entity
 * @Author Kern
 * @Date 2020/1/6 21:50
 * @Description: TODO
 */
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
