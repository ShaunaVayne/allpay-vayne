package cn.vayne.test.demo;

import cn.vayne.test.BaseTest;
import cn.vayne.web.config.ApplicationContextProvider;
import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.service.ExcelPoiService;
import cn.vayne.web.service.ExcelPoiTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/28 下午1:21
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Slf4j
public class Main extends BaseTest {

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
}
