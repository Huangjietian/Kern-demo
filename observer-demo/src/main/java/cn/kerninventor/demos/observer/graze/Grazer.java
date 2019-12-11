package cn.kerninventor.demos.observer.graze;

/**
 * @Title: Grazer
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.observer.graze
 * @Author Kern
 * @Date 2019/12/11 12:47
 * @Description: TODO
 */
public abstract class Grazer {

    private int count;

    public Grazer(int count) {
        this.count = count;
    }

    //数量
    public int count(){
        return count;
    }

    //吃草
    abstract void browseOn();

    //回笼
    abstract void backToTheFence();
}
