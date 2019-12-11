package cn.kerninventor.demos.decorator.gift;

/**
 * @Title: Gift
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator
 * @Author Kern
 * @Date 2019/12/11 10:20
 * @Description: TODO
 */
public interface Gift {

    default void iddentity(){
        System.out.println(this.desc() + "  " + this.getClass().getName());
    }

    //描述
    String desc();

}
