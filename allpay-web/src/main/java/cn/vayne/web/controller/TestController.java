package cn.vayne.web.controller;

import cn.vayne.web.domain.DTO.TestReq;
import cn.vayne.web.domain.DTO.TestReq2;
import cn.vayne.web.mapper.OrderInfoMapper;
import cn.vayne.web.model.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/22 下午3:18
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RestController
@Slf4j
@RequestMapping(value = "test")
public class TestController {

	@Autowired
	private OrderInfoMapper orderInfoMapper;

	@RequestMapping(method = RequestMethod.POST)
	public String test(@RequestBody TestReq testReq) {
		log.info("请求参数:{}", testReq.toString());
		testReq = valie(testReq);
		log.info("处理后的参数:{}", testReq.toString());
		return "success";
	}

	@RequestMapping(value = "test2",method = RequestMethod.POST)
	public String test2(@RequestBody TestReq2 testReq2) {
		log.info("请求参数:{}", testReq2.toString());
		log.info("处理后的参数:{}", testReq2.toString());
		return "success";
	}

	@RequestMapping(value = "test3",method = RequestMethod.GET)
	public String test3(Long id) {
		log.info("请求参数:{}", id);
		return "ok";
	}

	@RequestMapping(value = "test4",method = RequestMethod.GET)
	public String test4(Long id) {
		log.info("请求参数:{}", id);
		OrderInfo orderInfo = orderInfoMapper.selectTest(id);
		log.info("orderInfo:{}", orderInfo);
		return "ok";
	}



	private TestReq valie(TestReq testReq) {
		testReq.setSex("a");
		testReq.getLocationReqs().stream().forEach(e -> {
			e.setSex("b");
		});
		return testReq;
	}

}
