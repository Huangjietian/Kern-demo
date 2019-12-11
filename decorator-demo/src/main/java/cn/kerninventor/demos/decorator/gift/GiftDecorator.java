package cn.kerninventor.demos.decorator.gift;

/**
 * @Title: Decorator
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator
 * @Author Kern
 * @Date 2019/12/11 10:25
 * @Description: TODO
 */
public abstract class GiftDecorator implements Gift {

    protected Gift gift;

    public GiftDecorator(Gift gift) {
        this.gift = gift;
    }
}
