package cn.kerninventor.multithreaddemo.entity;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.UUID;

/**
 * @Title TestBill
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.entity
 * @Author Kern
 * @Date 2019/12/24 15:40
 * @Description TODO
 */
public class TestBill {

    private Long id;

    private String uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public static TestBill getRandomObj(String uuid){
        TestBill testBill = new TestBill();
        testBill.setUuid(uuid);
        return testBill;
    }
}
