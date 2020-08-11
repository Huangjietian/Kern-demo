package cn.kerninventory.demo.security;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface IegitimateUser extends User {

    @Override
    default int getLegality() {
        return 1;
    }

    UserAuthority getAuthorities();
}
