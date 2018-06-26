package cn.vayne.datasource.manager;

import cn.vayne.datasource.annotation.TargetDataSource;
import cn.vayne.datasource.common.DataSourceKey;
import cn.vayne.datasource.dao.OrderInfoDOMapper;
import cn.vayne.datasource.dao.ShopDOMapper;
import cn.vayne.datasource.model.OrderInfoDO;
import cn.vayne.datasource.model.OrderInfoDOExample;
import cn.vayne.datasource.model.ShopDO;
import cn.vayne.datasource.model.ShopDOExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/26 上午11:23
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class TestServiceImpl implements ITestServcie {

	@Autowired
	private ShopDOMapper shopDOMapper;

	@Autowired
	private OrderInfoDOMapper orderInfoDOMapper;

	@TargetDataSource(dataSourceKey = DataSourceKey.DB_SAAS)
	@Override
	public List<OrderInfoDO> queryOrderInfoDo() {
		OrderInfoDOExample orderInfoDOExample = new OrderInfoDOExample();
		OrderInfoDOExample.Criteria criteria = orderInfoDOExample.createCriteria();
		criteria.andIsDeletedNotEqualTo("Y");
		List<OrderInfoDO> orderInfoDOS = orderInfoDOMapper.selectByExample(orderInfoDOExample);
		return orderInfoDOS;
	}

	@TargetDataSource(dataSourceKey = DataSourceKey.DB_SAAS_SHOP)
	@Override
	public List<ShopDO> queryShopDo() {
		ShopDOExample shopDOExample = new ShopDOExample();
		ShopDOExample.Criteria criteria = shopDOExample.createCriteria();
		criteria.andIsDeleteNotEqualTo(1);
		List<ShopDO> shopDOS = shopDOMapper.selectByExample(shopDOExample);
		return shopDOS;
	}
}
