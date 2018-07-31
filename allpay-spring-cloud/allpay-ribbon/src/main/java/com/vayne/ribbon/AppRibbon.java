package com.vayne.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/30 上午11:18
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class AppRibbon {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(AppRibbon.class, args);
	}
}
