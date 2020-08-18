package cn.kerninventory.demos.algorithm.graph;

import java.util.Objects;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Line {

    private Dot d1;

    private Dot d2;

    public Line(Dot d1, Dot d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public Dot getD1() {
        return d1;
    }

    public void setD1(Dot d1) {
        this.d1 = d1;
    }

    public Dot getD2() {
        return d2;
    }

    public void setD2(Dot d2) {
        this.d2 = d2;
    }

    public double distance() {
        Objects.requireNonNull(d1);
        Objects.requireNonNull(d2);
        return Math.sqrt(
                Math.pow(Math.abs(d1.getHorizontal() - d2.getHorizontal()), 2)
                +
                Math.pow(Math.abs(d1.getVertical()   - d2.getVertical()  ), 2)
        );
    }

    

}
