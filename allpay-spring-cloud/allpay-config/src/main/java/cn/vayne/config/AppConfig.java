package cn.vayne.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/27 下午5:39
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient
public class AppConfig {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}
