package cn.vayne.datasource.dao;

import cn.vayne.datasource.model.OrderInfoDO;
import cn.vayne.datasource.model.OrderInfoDOExample;
import java.util.List;

public interface OrderInfoDOMapper {
    long countByExample(OrderInfoDOExample example);

    int insertSelective(OrderInfoDO record);

    List<OrderInfoDO> selectByExample(OrderInfoDOExample example);

    OrderInfoDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfoDO record);

    int updateByPrimaryKey(OrderInfoDO record);
}