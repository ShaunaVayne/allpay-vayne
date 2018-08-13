package com.vayne.ribbon.web;

import com.alibaba.fastjson.JSONObject;
import com.vayne.ribbon.model.OpenBlanceReq;
import com.vayne.ribbon.model.QueryBlanceReq;
import com.vayne.ribbon.service.BlanceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping(value = "mock")
@Slf4j
public class RibbbonController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${allpay.service.test.getAll}")
	private String getAllUrl;

	@Value("${allpay.service.blance.open}")
	private String blanceOpen;

	@Value("${allpay.service.blance.query}")
	private String blanceQuery;

	@Autowired
	private BlanceClient blanceClient;

	@RequestMapping(value = "test")
	public List test(){
		ResponseEntity<List> responseEntity = restTemplate.getForEntity(getAllUrl, List.class);
		return responseEntity.getBody();
	}

	@RequestMapping(value = "open", method = RequestMethod.POST)
	public String openBlance(@RequestBody OpenBlanceReq openBlanceReq) {
		ResponseEntity<String> responseEntity = blanceClient.openBlance(blanceOpen, openBlanceReq);
		return responseEntity.getBody();
	}

	@RequestMapping(value = "query")
	public String queryBlance(@RequestBody QueryBlanceReq queryBlanceReq) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.parseMediaType("application/json; charset=UTF-8"));
		String jsonParam = JSONObject.toJSONString(queryBlanceReq);
		log.info("参数:{}", jsonParam);
		HttpEntity<String> entity = new HttpEntity<>(jsonParam, httpHeaders);
		String result = blanceClient.queryBlance(blanceQuery, entity);
		return result;
	}
}
