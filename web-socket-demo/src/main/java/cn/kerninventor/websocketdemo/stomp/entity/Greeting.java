package cn.kerninventor.websocketdemo.stomp.entity;

/**
 * @Title: Greeting
 * @ProjectName demos
 * @PackageName cn.kerninventor.websocketdemo.stomp.entity
 * @Author Kern
 * @Date 2020/1/6 21:51
 * @Description: TODO
 */
public class Greeting {

    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
