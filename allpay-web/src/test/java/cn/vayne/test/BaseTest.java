package cn.vayne.test;

import cn.vayne.web.AppWeb;
import cn.vayne.web.utils.DateUtil;
import cn.vayne.web.utils.PurchaseRedisCache;
import cn.vayne.web.utils.RedisUtils;
import cn.vayne.web.utils.ServiceOrderRedisCache;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/28 下午1:18
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,  classes = { AppWeb.class })
public class BaseTest {

	public static final String workOrderRedisPrefix = "WORK_ORDER:";

	@Autowired
	private RedisUtils redisUtils;

	@Autowired
	private ServiceOrderRedisCache serviceOrderRedisCache;

	@Autowired
	private PurchaseRedisCache purchaseRedisCache;

	@Test
	public void test() {
		//String code = serviceOrderRedisCache.getCode(workOrderRedisPrefix, 105l);
		String code = purchaseRedisCache.getCode(workOrderRedisPrefix, 108l);
		System.out.println("主键code____________:"+code);
	}


	@Test
	public void test2() { String key = getDate(0);
		key = "THD" + key;
		String s = redisUtils.get(key);
		redisUtils.add(key);
		if(StringUtils.isBlank(s)) {
			List<Integer> list = Arrays.asList(-3, -2, -1);
			list.forEach(e -> {
				String date = getDate(e);
				date = "THD" + date;
				redisUtils.del(date);
			});
		}
		System.out.println(s);

	}

	public String getDate(Integer i) {
		Date dayBegin = DateUtil.getDayBegin(i);
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String format = sdf.format(dayBegin);
		return format;
	}



}
