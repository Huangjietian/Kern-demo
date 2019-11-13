package cn.kerninventor.demos.springsingtondemo.domain;

import cn.kerninventor.demos.springsingtondemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Title: UserMapper
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/13 19:09
 */
@Mapper
public interface UserMapper {

    void save(User user);
}
