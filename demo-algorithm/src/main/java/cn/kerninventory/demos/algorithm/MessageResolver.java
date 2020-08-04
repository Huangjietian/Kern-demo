package cn.kerninventory.demos.algorithm;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
@FunctionalInterface
public interface MessageResolver<M, R> {

    R resolve(M message);
}
