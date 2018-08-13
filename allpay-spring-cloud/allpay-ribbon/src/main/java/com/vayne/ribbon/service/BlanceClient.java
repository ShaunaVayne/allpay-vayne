package com.vayne.ribbon.service;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vayne.ribbon.model.OpenBlanceReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/9 下午5:36
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class BlanceClient {

	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<String> openBlance(String blanceOpen, OpenBlanceReq openBlanceReq) {
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(blanceOpen, openBlanceReq, String.class);
		return responseEntity;
	}

	@HystrixCommand(fallbackMethod = "queryBlanceBlack")
	public String queryBlance(String blanceQuery, HttpEntity<String> entity) {
		String result = restTemplate.postForObject(blanceQuery, entity, String.class);
		JSONObject jsonObject = JSONObject.parseObject(result);
		log.info("jsonObject:{}", jsonObject);
		return result;
	}

	public String queryBlanceBlack(String blanceQuery, HttpEntity<String> entity) {
		return "error";

	}
}
