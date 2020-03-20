package cn.kerninventory.demotkmybatis.base;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;

/**
 * @author Kern
 * @date 2020/3/20 11:35
 * @description TODO
 */
public interface BaseMapper <T> extends Mapper<T>, IdsMapper<T>, InsertMapper<T> {
}
