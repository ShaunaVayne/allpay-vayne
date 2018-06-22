package cn.vayne.web.controller;

import cn.vayne.web.domain.ExcelPoiReq;
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
	private OrderRepository orderRepository;

	@Autowired
	private ShopRepository shopRepository;

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

	/*@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("getExcel2")
	public ExcelPoiInfo getExcel() throws IOException {
		List<OrderInfo> entities = orderRepository.findAll();
		String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String tempXls = "/Users/vayne/myself/tip/data/"+dateTime+".xlsx";
		try(HSSFWorkbook workbook = new HSSFWorkbook(); FileOutputStream os = new FileOutputStream(tempXls)) {
			mkdirs(tempXls);
			if(entities.size() > 0) {
				Sheet sheet = workbook.createSheet("测试数据统计表");
				sheet.setDefaultColumnWidth((short) 20);
				// 生成第一层标题样式
				CellStyle style = getHeadStyle(workbook);
				//正文样式
				CellStyle styleTable = getContentStyle(workbook);
				Row titleRow = sheet.createRow(sheet.getLastRowNum());
				String[] column = { "序号", "订单号","订单状态","支付方式"};
				Cell cellTitle = null;
				for (int i = 0; i < column.length; i++) {
					cellTitle = titleRow.createCell(i);
					cellTitle.setCellValue(column[i]);
					cellTitle.setCellStyle(style);
				}
				Cell cellTable = null;
				for (OrderInfo entity : entities) {
					Row dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
					cellTable = dataRow.createCell(0);
					cellTable.setCellValue(entity.getId());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(1);
					cellTable.setCellValue(entity.getOrderNo());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(2);
					cellTable.setCellValue(entity.getOrderStatus());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(3);
					cellTable.setCellValue(entity.getPaymentType());
					cellTable.setCellStyle(styleTable);
				}
			}else {
				Sheet sheet = workbook.createSheet("卡密重置明细数据");
				Row headRow = sheet.createRow(0);
				headRow.createCell(0).setCellValue(
						"数据为空 或查询方式错误请重新查询并导出" + "##请优先点击查询按钮 再点击导出");
			}
			workbook.write(os);
			os.flush();
		}catch (Exception e) {
			tempXls = null;
			log.error(e.getMessage(),e);
		}
		ExcelPoiInfo excelPoiInfo = new ExcelPoiInfo();
		excelPoiInfo.put(10000,"ok");
		return excelPoiInfo;
	}*/

	public static String encodeDownloadFilename(String filename, String agent)
			throws IOException {
		filename = "=?gbk?B?"
				+ new BASE64Encoder().encode(filename.getBytes("gbk"))
				+ "?=";
		filename = filename.replaceAll("\r\n", "");
		return filename;
	}

}
