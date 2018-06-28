package cn.vayne.web.controller;

import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.service.AsyncService;
import cn.vayne.web.service.ExcelPoiService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/28 下午5:57
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RestController
@Slf4j
public class HelloController {

	@Autowired
	private AsyncService asyncService;

	@Autowired
	private ExcelPoiService excelPoiService;

	@RequestMapping("/hello/{id}")
	public String submit(HttpServletRequest httpServletRequest, @PathVariable("id") String id) throws Exception {
		switch (id) {
			case "1" :
				id = "chrome";
				break;
			case "2" :
				id = "firefox";
				break;
			case "3" :
				id = "safari";
				break;
			default:
				id = "test";
		}
		String header = httpServletRequest.getHeader("User-Agent");
		ExcelPoiReq req = new ExcelPoiReq();
		log.info("start submit");
		req.setBegTime("1529942401000");
		req.setEndTime("1530028799000");
		Future<HSSFWorkbook> workbookFuture = excelPoiService.excelOut(req, "test");
		long startTime = System.currentTimeMillis();
		String dateTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String filename = "/Users/vayne/myself/tip/data/"+"订单统计表"+ id + dateTime +".xls";
		FileOutputStream os = new FileOutputStream(filename);
		workbookFuture.get().write(os);
		os.flush();
		os.close();
		long endTime = System.currentTimeMillis();
		log.info("报表导出执行时间{}",endTime - startTime);
		log.info("end submit");
		return "success";
	}

	@RequestMapping("/hello2/{id}")
	public Object test2(HttpServletRequest request, @PathVariable("id") String id) {
		log.info("参数:{}", id);
		return request.getHeader("User-Agent");
	}
}
