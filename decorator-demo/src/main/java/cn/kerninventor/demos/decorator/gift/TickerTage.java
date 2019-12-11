package cn.kerninventor.demos.decorator.gift;

/**
 * @Title: TickerTage
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator
 * @Author Kern
 * @Date 2019/12/11 10:30
 * @Description: TODO
 */
public class TickerTage extends GiftDecorator {

    public TickerTage(Gift gift) {
        super(gift);
    }

    @Override
    public String desc() {
        return gift.desc() + "+彩纸";
    }
}
