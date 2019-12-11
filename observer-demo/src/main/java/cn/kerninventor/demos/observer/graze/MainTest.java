package cn.kerninventor.demos.observer.graze;

/**
 * @Title: MainTest
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.observer.graze
 * @Author Kern
 * @Date 2019/12/11 13:02
 * @Description: TODO
 */
public class MainTest {

    public static void main(String[] args) {
        Grazer cow = new Cow(200);
        Grazer sheep = new Sheep(150);
        Pastoralist.attach(cow);
        Pastoralist.attach(sheep);
        Pastoralist.notifyBrowseOn();
        Pastoralist.notifyBackToTheFence();
        Pastoralist.notifyCount();
    }
}
