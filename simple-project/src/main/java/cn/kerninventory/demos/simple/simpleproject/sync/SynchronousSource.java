package cn.kerninventory.demos.simple.simpleproject.sync;

import java.util.Date;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface SynchronousSource <S> {

    S get(String corpCode, Date limitingTime);
}
