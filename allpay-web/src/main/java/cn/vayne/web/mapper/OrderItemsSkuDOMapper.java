package cn.vayne.web.mapper;

import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.model.OrderItemsSkuDO;
import cn.vayne.web.model.OrderItemsSkuDOExample;
import cn.vayne.web.model.SkuItemDo;

import java.util.List;

public interface OrderItemsSkuDOMapper {
    long countByExample(OrderItemsSkuDOExample example);

    int insertSelective(OrderItemsSkuDO record);

    List<OrderItemsSkuDO> selectByExample(OrderItemsSkuDOExample example);

    OrderItemsSkuDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemsSkuDO record);

    int updateByPrimaryKey(OrderItemsSkuDO record);

	List<SkuItemDo> selectItemByTime(ExcelPoiReq req);

}