package cn.vayne.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/19 下午7:19
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class AppServer {

	public static void main(String[] args) {
		SpringApplication.run(AppServer.class, args);
	}
}
