package cn.vayne.test.demo;

import cn.vayne.web.config.ApplicationContextProvider;
import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.service.ExcelPoiService;
import cn.vayne.web.service.ExcelPoiTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/28 下午1:21
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Slf4j
public class Main {

	@Autowired
	private ExcelPoiService excelPoiService;

	@Resource
	private ExcelPoiTask excelPoiTask;

	@Test
	public void test2() throws Exception {
		ExcelPoiTask m1 = ApplicationContextProvider.getBean("excelPoiTask", ExcelPoiTask.class);
		ExcelPoiTask m2 = ApplicationContextProvider.getBean("excelPoiTask", ExcelPoiTask.class);
		ExcelPoiTask m3 = ApplicationContextProvider.getBean("excelPoiTask", ExcelPoiTask.class);
		ExcelPoiTask m4 = ApplicationContextProvider.getBean("excelPoiTask", ExcelPoiTask.class);
		ExcelPoiTask m5 = ApplicationContextProvider.getBean("excelPoiTask", ExcelPoiTask.class);
		ExcelPoiReq req = new ExcelPoiReq();
		m1.getExcelPoiService().excelOut(req,"1a");
		m2.getExcelPoiService().excelOut(req,"2b");
		m3.getExcelPoiService().excelOut(req,"3c");
		m4.getExcelPoiService().excelOut(req,"4d");
		m5.getExcelPoiService().excelOut(req,"5e");
		log.info("end");
	}

	@Test
	public void test() {
		final CountDownLatch latch = new CountDownLatch(2);
		new Thread(() -> {
			try {
				System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
				Thread.sleep(3000);
				System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
				latch.countDown();
			}catch(Exception e) {
			    log.error("");
			}
		}).start();

		new Thread(() -> {
			try {
				System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
				Thread.sleep(3000);
				System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
				latch.countDown();
			}catch(Exception e) {
			    log.error("");
			}
		}).start();

		try {
			System.out.println("等待2个子线程执行完毕...");
			latch.await();	//调用await()方法的线程会被挂起，它会等待直到count值为0才继续执行
			System.out.println("2个子线程已经执行完毕");
			System.out.println("继续执行主线程");
		}catch(Exception e) {
		    log.error("");
		}
	}

	@Test
	public void test3() {

		//浮点数,存在精度问题
		double d1 = 0.19*6;
		System.out.println(d1);//1.1400000000000001
		//采用BigDecimal 来解决精度问题
		BigDecimal bd1 = new BigDecimal("0.19");
		BigDecimal bd2 = new BigDecimal("6");
		BigDecimal bd3 = bd1.multiply(bd2);
		System.out.println(bd3);//1.14
	}

	@Test
	public void test4() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(date);
		System.out.println(format);
		Date yesterday = new Date(new Date().getTime() - 86400000L);
		String format1 = dateFormat.format(yesterday);
		System.out.println(format1+"昨天");
	}

	@Test
	public void test5() {
		int i = 2;
	}


}
