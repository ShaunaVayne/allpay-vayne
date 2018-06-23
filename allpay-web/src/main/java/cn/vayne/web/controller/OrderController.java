package cn.vayne.web.controller;

import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.model.OrderInfo;
import cn.vayne.web.repositorys.sass.OrderRepository;
import cn.vayne.web.repositorys.sassshop.ShopRepository;
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
import java.util.List;

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("getExcel")
	public void getExcel(ExcelPoiReq req, HttpServletResponse response, HttpServletRequest request) throws IOException {
		HSSFWorkbook workbook = orderService.getExcel(req);
		String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
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
	public Object testMapper(ExcelPoiReq req) {
		log.info("请求参数:{}",req);
		List<OrderInfo> orderInfos = orderService.testMapper(req);
		log.info("查询返回参数:{}",orderInfos);
		return orderInfos;
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
