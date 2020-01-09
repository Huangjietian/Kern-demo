package cn.kerninventor.multithreadedtransactiondemo.demo1;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Title: StaffDAO
 * @ProjectName demos
 * @PackageName cn.kerninventor.multithreadedtransactiondemo
 * @Author Kern
 * @Date 2019/12/19 17:37
 * @Description: TODO
 */
@Mapper
public interface StaffDAO extends AsynInsertDAO<StaffBO> {

}
