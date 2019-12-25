package cn.kerninventor.multithreaddemo.dao;

import cn.kerninventor.multithreaddemo.entity.TestBill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Title TestBillDAO
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.dao
 * @Author Kern
 * @Date 2019/12/24 15:40
 * @Description TODO
 */
@Mapper
public interface TestBillDAO {

    void save(TestBill bill) throws Exception;

    void saveBatch(@Param("list") List<TestBill> list);
}
