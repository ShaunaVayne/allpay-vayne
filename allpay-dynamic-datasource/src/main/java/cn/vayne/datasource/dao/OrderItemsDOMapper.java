package cn.vayne.datasource.dao;

import cn.vayne.datasource.model.OrderItemsDO;
import cn.vayne.datasource.model.OrderItemsDOExample;
import java.util.List;

public interface OrderItemsDOMapper {
    long countByExample(OrderItemsDOExample example);

    int insertSelective(OrderItemsDO record);

    List<OrderItemsDO> selectByExample(OrderItemsDOExample example);

    OrderItemsDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemsDO record);

    int updateByPrimaryKey(OrderItemsDO record);
}