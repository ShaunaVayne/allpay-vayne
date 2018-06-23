package cn.vayne.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/20 下午2:07
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@SpringBootApplication
@MapperScan("cn.vayne.web.mapper")
public class AppWeb {

	public static void main(String[] args) {
		SpringApplication.run(AppWeb.class, args);
	}
}
