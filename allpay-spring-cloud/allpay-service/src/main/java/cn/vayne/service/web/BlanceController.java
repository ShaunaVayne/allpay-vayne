package cn.vayne.service.web;

import cn.vayne.service.entity.OpenBlanceReq;
import cn.vayne.service.entity.QueryBlanceReq;
import com.vayne.dal.base.BaseResp;
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
	public BaseResp<List<OrderGradeLogDO>> query(@RequestBody QueryBlanceReq queryBlanceReq) {
		/**
		 * 测试Hystrix服务降级:
		 * 作为提供方输出了应当返回的结果,但是因为返回前延迟5秒,此时消费方触发了服务请求超时异常, 服务消费方则通过HystrixCommand注解中指定的
		 * 降级逻辑进行执行, 因此在页面返回error, 注意: 注解指定的降级方法方法名必须为注解指定的, 同时参数返回值必须与主方法一致.
		 * 此种机制, 对自身的服务起到了基础保护, 同时还为异常提供了自动的降级切换机制.
		 */
		/*try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		log.info("queryBlanceReq:{}", queryBlanceReq);
		BaseResp<List<OrderGradeLogDO>> resp = null;
		OrderGradeLogDOExample example = new OrderGradeLogDOExample();
		OrderGradeLogDOExample.Criteria criteria = example.createCriteria();
		criteria.andShopIdEqualTo(queryBlanceReq.getShopId());
		criteria.andProprietorIdEqualTo(queryBlanceReq.getProprietorId());
		List<OrderGradeLogDO> orderGradeLogDOS = orderGradeLogDOMapper.selectByExample(example);
		try {
		    if(orderGradeLogDOS != null && orderGradeLogDOS.size() > 0) {
				resp = BaseResp.buildSuccessResp(BaseResp.class).setData(orderGradeLogDOS);
			}else {
		    	log.warn("查询信息为空");
				resp = BaseResp.buildSuccessResp(BaseResp.class).setData("查询信息为空!");
			}
		}catch(Exception e) {
			resp = BaseResp.buildFailResp(e, "商品结算页", BaseResp.class);
		}
		log.info("返回结果:{}", resp);
		return resp;
	}


}
