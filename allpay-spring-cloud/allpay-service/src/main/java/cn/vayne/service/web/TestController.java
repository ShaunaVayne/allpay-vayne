package cn.vayne.service.web;

import cn.vayne.service.entity.UserEntity;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/31 下午2:17
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RequestMapping(value = "test")
@RestController
@Slf4j
public class TestController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "sum", method = RequestMethod.POST)
	public Object sum() {
		return null;
	}

	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public List getAll() {
		List<String> services = discoveryClient.getServices();
		UserEntity wangkun1 = new UserEntity(1, "wangkun1");
		UserEntity wangkun2 = new UserEntity(2, "wangkun2");
		UserEntity wangkun3 = new UserEntity(3, "wangkun3");
		UserEntity wangkun4 = new UserEntity(4, "wangkun4");
		UserEntity wangkun5 = new UserEntity(5, "wangkun5");
		List<UserEntity> userEntities = Arrays.asList(wangkun1, wangkun2, wangkun3, wangkun4, wangkun5);
		log.info("/add:service_msg:{},result:{}",JSON.toJSONString(services),userEntities);
		return userEntities;
	}

	@PostMapping(value = "test_02")
	public String test_02() {
		return "test_02";
	}

}
