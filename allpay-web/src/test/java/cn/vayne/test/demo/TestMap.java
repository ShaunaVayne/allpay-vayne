package cn.vayne.test.demo;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/10/29 下午3:09
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public class TestMap {

	private final ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

	public void add(String key) {
		Integer integer = map.get(key);
		//....
	}
}
