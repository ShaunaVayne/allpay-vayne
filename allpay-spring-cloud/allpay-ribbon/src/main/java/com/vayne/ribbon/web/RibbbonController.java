package com.vayne.ribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/31 下午2:31
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RestController
public class RibbbonController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${allpay.service.test.getAll}")
	private String getAllUrl;

	@RequestMapping(value = "test")
	public List test(){
		ResponseEntity<List> responseEntity = restTemplate.getForEntity(getAllUrl, List.class);
		return responseEntity.getBody();
	}
}
