package com.vayne.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vayne.ribbon.model.OpenBlanceReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/8/9 下午5:36
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Service
public class BlanceClient {

	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<String> openBlance(String blanceOpen, OpenBlanceReq openBlanceReq) {
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(blanceOpen, openBlanceReq, String.class);
		return responseEntity;
	}

	@HystrixCommand(fallbackMethod = "queryBlanceBlack")
	public List queryBlance(String blanceQuery, HttpEntity<String> entity) {
		List result = restTemplate.postForObject(blanceQuery, entity, List.class);
		return result;
	}

	public List queryBlanceBlack(String blanceQuery, HttpEntity<String> entity) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("error");
		return strings;

	}
}
