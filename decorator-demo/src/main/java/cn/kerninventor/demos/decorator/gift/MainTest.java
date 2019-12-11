package cn.kerninventor.demos.decorator.gift;

/**
 * @Title: MainTest
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator
 * @Author Kern
 * @Date 2019/12/11 10:28
 * @Description: TODO
 */
public class MainTest {

    public static void main(String[] args) {
        Gift tree = new ChristmasTrees();
        System.out.println(tree.desc());

        Gift treeHaveBell = new LittleBell(tree);
        System.out.println(treeHaveBell.desc());

        Gift treeHaveBellAndTape = new TickerTage(treeHaveBell);
        System.out.println(treeHaveBellAndTape.desc());

        Gift treeHaveTape = new TickerTage(tree);
        System.out.println(treeHaveTape.desc());

    }
}
