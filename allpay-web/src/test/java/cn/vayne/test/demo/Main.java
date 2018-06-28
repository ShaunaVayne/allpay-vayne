package cn.vayne.test.demo;

import cn.vayne.test.BaseTest;
import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.service.ExcelPoiService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

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

	@Test
	public void test() throws Exception {
		long startTime = System.currentTimeMillis();
		ExcelPoiReq excelPoiReq = new ExcelPoiReq();
		excelPoiReq.setBegTime("1529942401000");
		excelPoiReq.setEndTime("1530028799000");
		HSSFWorkbook hssfWorkbook = excelPoiService.excelOut(excelPoiReq);
		String dateTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String filename = "/Users/vayne/myself/tip/data/"+"订单统计表" + dateTime +".xls";
		FileOutputStream os = new FileOutputStream(filename);
		hssfWorkbook.write(os);
		os.flush();
		long endTime = System.currentTimeMillis();
		log.info("报表导出执行时间{}",endTime - startTime);
	}
}
