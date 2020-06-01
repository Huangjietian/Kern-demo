package cn.kerninventory.demos.spring.security.mapper;

import cn.kerninventory.demos.spring.security.model.TestUser;
import cn.kerninventory.demos.spring.security.model.TestUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TestUserMapper {
    long countByExample(TestUserExample example);

    int deleteByExample(TestUserExample example);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    List<TestUser> selectByExample(TestUserExample example);

    int updateByExampleSelective(@Param("record") TestUser record, @Param("example") TestUserExample example);

    int updateByExample(@Param("record") TestUser record, @Param("example") TestUserExample example);
}