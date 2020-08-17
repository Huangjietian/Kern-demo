package cn.kerninventory.demos.algorithm.routing;

import java.util.concurrent.ConcurrentHashMap;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class RipRouteNode {

    private ConcurrentHashMap<RipRouteNode, Integer> distanceVectorHashMap;

    public RipRouteNode(RipRouteNode initNode) {
        distanceVectorHashMap = new ConcurrentHashMap<>(16);
        accept(initNode);
    }

    public ConcurrentHashMap<RipRouteNode, Integer> getDistanceVectorHashMap() {
        return distanceVectorHashMap;
    }

    public void accept(RipRouteNode ripRouteNode) {

    }
}
