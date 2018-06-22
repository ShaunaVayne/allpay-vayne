package cn.vayne.test;

import cn.vayne.test.domain.ShopDO;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/22 上午9:25
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public class Test {

	@org.junit.Test
	public void test1 () {
		String paymentType = null;
		if(paymentType != null) {
			switch (paymentType) {
				case "OFFLINE" :
					paymentType = "线下/到店支付";
					break;
				case "ONLINE" :
					paymentType = "线上/在线支付";
					break;
				default:
					paymentType = "";
			}
		System.out.println(paymentType);
		}
		String isGift = "N".equals("Y") ? "是" : "否";
		System.out.println(isGift);
	}

	@org.junit.Test
	public void test2() {
		Set<String> strings = new HashSet<>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		System.out.println(strings.contains("e"));

		ShopDO shopDO = new ShopDO();
		System.out.println(shopDO.getCity());

	}
}
