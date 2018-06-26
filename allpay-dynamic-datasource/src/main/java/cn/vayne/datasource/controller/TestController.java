package cn.vayne.datasource.controller;

import cn.vayne.datasource.manager.ITestServcie;
import cn.vayne.datasource.model.OrderInfoDO;
import cn.vayne.datasource.model.ShopDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/26 上午11:22
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class TestController {

	@Autowired
	private ITestServcie iTestServcie;

	@RequestMapping(value = "/test")
	public Object test() {
		List<OrderInfoDO> orderInfoDOS = iTestServcie.queryOrderInfoDo();
		return orderInfoDOS;
	}

	@RequestMapping(value = "/test2")
	public List<ShopDO> test2() {
		List<ShopDO> shopDOS = iTestServcie.queryShopDo();
		return shopDOS;
	}
}
