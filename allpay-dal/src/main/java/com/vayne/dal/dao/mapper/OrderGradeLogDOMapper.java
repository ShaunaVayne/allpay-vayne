package com.vayne.dal.dao.mapper;

import com.vayne.dal.dao.model.OrderGradeLogDO;
import com.vayne.dal.dao.model.OrderGradeLogDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGradeLogDOMapper {
    long countByExample(OrderGradeLogDOExample example);

    int deleteByExample(OrderGradeLogDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderGradeLogDO record);

    int insertSelective(OrderGradeLogDO record);

    List<OrderGradeLogDO> selectByExample(OrderGradeLogDOExample example);

    OrderGradeLogDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderGradeLogDO record, @Param("example") OrderGradeLogDOExample example);

    int updateByExample(@Param("record") OrderGradeLogDO record, @Param("example") OrderGradeLogDOExample example);

    int updateByPrimaryKeySelective(OrderGradeLogDO record);

    int updateByPrimaryKey(OrderGradeLogDO record);
}