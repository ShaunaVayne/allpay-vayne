package cn.vayne.test;

import cn.vayne.web.AppWeb;
import cn.vayne.web.mapper.UserMapper;
import cn.vayne.web.model.ParameterConfig;
import cn.vayne.web.model.User;
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

	@Autowired
	private UserMapper userMapper;

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

	@Test
	public void test3() {
		User user = new User();
		user.setUserName("王琨");
		ParameterConfig p1 = new ParameterConfig(1,"sex","男");
		ParameterConfig p2 = new ParameterConfig(2,"location","上海");
		List<ParameterConfig> favoriteList = Arrays.asList(p1, p2);
		user.setFavorites(favoriteList);
		userMapper.addUser(user);
		System.out.println("success-sssssss");
	}

	@Test
	public void test4() {
		User user = userMapper.getUser(4);
		System.out.println(user);
		System.out.println("success-sssssss");
	}

	public String getDate(Integer i) {
		Date dayBegin = DateUtil.getDayBegin(i);
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String format = sdf.format(dayBegin);
		return format;
	}



}
