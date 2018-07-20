package cn.vayne.web.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: WangKun
 * @Description: 网速
 * @Date: Created in 2018/6/28 下午5:36
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Component
public class ApplicationContextProvider implements ApplicationContextAware {

	private static ApplicationContext context;

	private ApplicationContextProvider(){}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public  static <T> T getBean(String name,Class<T> aClass){
		return context.getBean(name,aClass);
	}


}
