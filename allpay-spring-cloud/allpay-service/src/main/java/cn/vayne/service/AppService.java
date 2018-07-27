package cn.vayne.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/7/27 下午3:07
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class AppService {

	public static void main(String[] args) {
		SpringApplication.run(AppService.class, args);
	}
}
