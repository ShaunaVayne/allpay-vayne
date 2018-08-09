package cn.vayne.service.web;

import cn.vayne.service.entity.OpenBlanceReq;
import cn.vayne.service.entity.QueryBlanceReq;
import com.vayne.dal.dao.mapper.OrderGradeLogDOMapper;
import com.vayne.dal.dao.model.OrderGradeLogDO;
import com.vayne.dal.dao.model.OrderGradeLogDOExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/3 上午11:05
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RestController
@RequestMapping(value = "blance")
@Slf4j
public class BlanceController {

	@Autowired
	private OrderGradeLogDOMapper orderGradeLogDOMapper;

	@RequestMapping(value = "open")
	public Object open(@RequestBody OpenBlanceReq openBlanceReq) {
		log.info("请求入参:{}", openBlanceReq);
		OrderGradeLogDO orderGradeLogDO = new OrderGradeLogDO();
		orderGradeLogDO.setShopId(openBlanceReq.getShopId());
		orderGradeLogDO.setOrderAmount(openBlanceReq.getOrderAmount());
		orderGradeLogDO.setOrderNum(openBlanceReq.getOrderNum());
		orderGradeLogDO.setCreateTime(new Date());
		orderGradeLogDO.setOrderTime(new Date(new Date().getTime() - 86400000L));
		orderGradeLogDO.setIsDeleted("N");
		orderGradeLogDO.setCreator("wangkun");
		orderGradeLogDO.setModifier("wangkun");
		orderGradeLogDO.setProprietorId("CONTINENTAL");
		int i = orderGradeLogDOMapper.insertSelective(orderGradeLogDO);
		return i == 1 ? "success" : "fail";
	}

	@RequestMapping(value = "query")
	public List<OrderGradeLogDO> query(@RequestBody QueryBlanceReq queryBlanceReq) {
		log.info("queryBlanceReq:{}", queryBlanceReq);
		OrderGradeLogDOExample example = new OrderGradeLogDOExample();
		OrderGradeLogDOExample.Criteria criteria = example.createCriteria();
		criteria.andShopIdEqualTo(queryBlanceReq.getShopId());
		criteria.andProprietorIdEqualTo(queryBlanceReq.getProprietorId());
		List<OrderGradeLogDO> orderGradeLogDOS = orderGradeLogDOMapper.selectByExample(example);
		if(orderGradeLogDOS != null && orderGradeLogDOS.size() > 0) {
			return orderGradeLogDOS;
		}else {
			return null;
		}

	}



}
