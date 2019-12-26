package cn.kerninventor.multithreaddemo.countDownDemo.entity;

/**
 * @Title TestBill
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.countDownDemo.entity
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
