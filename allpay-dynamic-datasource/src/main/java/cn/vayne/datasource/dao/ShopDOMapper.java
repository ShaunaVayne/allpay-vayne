package cn.vayne.datasource.dao;

import cn.vayne.datasource.model.ShopDO;
import cn.vayne.datasource.model.ShopDOExample;
import java.util.List;

public interface ShopDOMapper {
    long countByExample(ShopDOExample example);

    int insertSelective(ShopDO record);

    List<ShopDO> selectByExample(ShopDOExample example);

    ShopDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopDO record);

    int updateByPrimaryKey(ShopDO record);
}