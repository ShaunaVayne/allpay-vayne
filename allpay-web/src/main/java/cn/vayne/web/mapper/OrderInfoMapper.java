package cn.vayne.web.mapper;

import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.model.ItemDO;
import cn.vayne.web.model.OrderInfo;
import cn.vayne.web.model.OrderInfoExample;
import java.util.List;

public interface OrderInfoMapper {
    long countByExample(OrderInfoExample example);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

	List<ItemDO> selectItemByTime(ExcelPoiReq req);

}