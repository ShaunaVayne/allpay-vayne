package cn.vayne.web.controller;

import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.service.ExcelPoiService;
import cn.vayne.web.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/20 下午2:22
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("excel")
@Slf4j
public class OrderController {


	@Autowired
	private OrderService orderService;

	@Autowired
	private ExcelPoiService excelPoiService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("getExcel")
	public void getExcel(ExcelPoiReq req, HttpServletResponse response, HttpServletRequest request) throws IOException {
		HSSFWorkbook workbook = orderService.getExcel(req);
		String dateTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		response.setContentType("application/x-excel;charset=UTF-8");
		String filename = "订单统计表"+ dateTime +".xls";
		String agent = request.getHeader("user-agent");
		filename = encodeDownloadFilename(filename, agent);
		response.setHeader("Content-Disposition", "attachment;filename="
				+ filename);
		workbook.write(response.getOutputStream());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("testMapper")
	public void testMapper(ExcelPoiReq req, HttpServletResponse response, HttpServletRequest request) {
		log.info("请求参数:{}",req);
		HSSFWorkbook workbook = excelPoiService.excelOut(req);
		String dateTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		response.setContentType("application/x-excel;charset=UTF-8");
		String filename = "订单统计表"+ dateTime +".xls";
		String agent = request.getHeader("user-agent");
		try {
			filename = encodeDownloadFilename(filename, agent);
			response.setHeader("Content-Disposition", "attachment;filename="
					+ filename);
			workbook.write(response.getOutputStream());
		} catch (Exception e) {
			log.error("导出报表错误:{}",e);
		}
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
