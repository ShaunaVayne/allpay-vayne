package cn.vayne.web.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/10/23 下午6:37
 * @ProjectName: saas-purchase
 * @Version: 1.0.0
 */
@Slf4j
@Component
public class PurchaseRedisCache {

	private static String prefix = "SERVICE_ORDER:";

	@Autowired
	private StringRedisTemplate redisTemplate;

	@Resource(name = "stringRedisTemplate")
	private ValueOperations<String, String> valueOperations;

	/**
	 * 订单前缀（采购单分为采购单和订购单）
	 * @param orderPrefix
	 * @return
	 */
	public String getCode(String orderPrefix, Long storeId) {
		String dateStr = DateUtils.getDate(0);
		String key = orderPrefix + storeId + dateStr;
		increment(key);
		String s = get(key);
		if(StringUtils.isBlank(s) || "1".equals(s)) {
			// 设置超时时间3天
			valueOperations.set(getRedisKey(key), s,3, TimeUnit.DAYS);
		}
		return convertToOrderCode(s);
	}

	/**
	 * 自增数值转换为四字符字符串（以0填充空位）
	 * @param s
	 * @return
	 */
	private String convertToOrderCode(String s){
		int codeSize = 4;
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0 ;i < codeSize - s.trim().length(); i++){
			sb.insert(0, "0");
		}
		return sb.toString();
	}

	public String get(String key) {
		long start = System.currentTimeMillis();
		String str = valueOperations.get(getRedisKey(key));
		long end = System.currentTimeMillis();
		log.info("查询key:{},执行时间:{},返回值:{}",key,end - start, str);
		return str;
	}

	public void increment(String key) {
		long start = System.currentTimeMillis();
		valueOperations.increment(getRedisKey(key), 1);
		long end = System.currentTimeMillis();
		log.info("新增key:{},执行时间:{}",key,end - start);
	}

	public void del(String key) {
		long start = System.currentTimeMillis();
		redisTemplate.delete(getRedisKey(key));
		long end = System.currentTimeMillis();
		log.info("删除key:{},执行时间:{}",key, end - start);
	}

	public String getRedisKey(String key) {
		if (StringUtils.isNotBlank(prefix)) {
			return this.prefix + key;
		} else {
			return key;
		}
	}
}
