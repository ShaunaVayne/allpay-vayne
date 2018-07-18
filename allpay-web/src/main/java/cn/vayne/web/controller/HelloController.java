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
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;

/**
 * @Author: WangKun
 * @Description: text
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

	@RequestMapping("/hello")
	public String submit(ExcelPoiReq req, HttpServletResponse response, HttpServletRequest request) throws Exception {
		try {
			Future<HSSFWorkbook> workbookFuture = excelPoiService.excelOut(req,"test");
			while(true) {
				if(workbookFuture.isDone()) {
					String dateTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
					response.setContentType("application/x-excel;charset=UTF-8");
					String filename = "订单统计表"+ dateTime +".xls";
					String agent = request.getHeader("user-agent");
					filename = encodeDownloadFilename(filename, agent);
					response.setHeader("Content-Disposition", "attachment;filename="
							+ filename);
					workbookFuture.get().write(response.getOutputStream());
					break;
				}
			}
		}catch(Exception e) {
			log.warn("查询数据进行导出数据异常:{}", e);

		}
		/*switch (id) {
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
		while (true) {
			if(workbookFuture.isDone()) {
				workbookFuture.get().write(os);
				os.flush();
				os.close();
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		log.info("报表导出执行时间{}",endTime - startTime);
		log.info("end submit");*/
		return "success";
	}

	@RequestMapping("/hello2/{id}")
	public Object test2(HttpServletRequest request, @PathVariable("id") String id) {
		log.info("参数:{}", id);
		return request.getHeader("User-Agent");
	}

	public static String encodeDownloadFilename(String filename, String agent)
			throws IOException {
		filename = "=?gbk?B?"
				+ new BASE64Encoder().encode(filename.getBytes("gbk"))
				+ "?=";
		filename = filename.replaceAll("\r\n", "");
		return filename;
	}
}
