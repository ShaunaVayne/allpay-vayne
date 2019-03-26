package cn.vayne.web.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/10/23 下午5:20
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Component
@Slf4j
public class RedisUtils {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Resource(name = "stringRedisTemplate")
	private ValueOperations<String, String> valueOperString;


	public String get(String key) {
		long start = System.currentTimeMillis();
		String str = valueOperString.get(key);
		long end = System.currentTimeMillis();
		log.info("查询key:{},执行时间:{},返回值:{}",key,end - start, str);
		return str;
	}

	public void add(String key) {
		long start = System.currentTimeMillis();
		valueOperString.increment(key, 1);
		long end = System.currentTimeMillis();
		log.info("新增key:{},执行时间:{}",key,end - start);
	}

	public void del(String key) {
		long start = System.currentTimeMillis();
		stringRedisTemplate.delete(key);
		long end = System.currentTimeMillis();
		log.info("删除key:{},执行时间:{}",key, end - start);
	}
}
