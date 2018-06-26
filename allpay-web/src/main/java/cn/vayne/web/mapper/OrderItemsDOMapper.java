package cn.vayne.web.mapper;

import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.model.ItemDO;
import cn.vayne.web.model.ItemSumDo;
import cn.vayne.web.model.OrderItemsDO;
import cn.vayne.web.model.OrderItemsDOExample;
import java.util.List;

public interface OrderItemsDOMapper {
    long countByExample(OrderItemsDOExample example);

    int insertSelective(OrderItemsDO record);

    List<OrderItemsDO> selectByExample(OrderItemsDOExample example);

    OrderItemsDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemsDO record);

    int updateByPrimaryKey(OrderItemsDO record);

	ItemDO selectItemByOrderId(Long id);

	List<ItemSumDo> selectItemByTime(ExcelPoiReq req);
}