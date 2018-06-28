package cn.vayne.web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/28 下午5:56
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {

	@Override
	@Async("asyncServiceExecutor")
	public void executeAsync() {
		log.info("start executeAsync");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		log.info("end executeAsync");
	}
}
