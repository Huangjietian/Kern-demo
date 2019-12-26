package cn.kerninventor.multithreaddemo.springDemo.dao;

import cn.kerninventor.multithreaddemo.springDemo.entity.TestBill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Title TestBillDAO
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.countDownDemo.dao
 * @Author Kern
 * @Date 2019/12/24 15:40
 * @Description TODO
 */
@Mapper
public interface TestBillDAO {

    void save(TestBill bill) throws Exception;

    void saveBatch(@Param("list") List<TestBill> list);
}
