package cn.kerninventor.demos.observer.graze;

/**
 * @Title: Cow
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.observer.graze
 * @Author Kern
 * @Date 2019/12/11 12:51
 * @Description: TODO
 */
public class Cow extends Grazer {

    public Cow(int count) {
        super(count);
    }

    public void browseOn() {
        System.out.println("The cows is going to pasture");
    }

    public void backToTheFence() {
        System.out.println("The cows back to the fence");
    }
}
