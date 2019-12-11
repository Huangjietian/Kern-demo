package cn.kerninventor.demos.decorator.gift;

/**
 * @Title: LittleBell
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator
 * @Author Kern
 * @Date 2019/12/11 10:27
 * @Description: TODO
 */
public class LittleBell extends GiftDecorator {

    public LittleBell(Gift gift) {
        super(gift);
    }

    @Override
    public String desc() {
        return gift.desc() + "+小铃铛" ;
    }
}
