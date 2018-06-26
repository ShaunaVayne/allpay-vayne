package cn.vayne.datasource.manager;

import cn.vayne.datasource.model.OrderInfoDO;
import cn.vayne.datasource.model.ShopDO;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/26 上午11:27
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public interface ITestServcie {

	List<OrderInfoDO> queryOrderInfoDo();

	List<ShopDO> queryShopDo();
}
