package cn.vayne.web.controller;

import cn.vayne.web.domain.ExcelPoiInfo;
import cn.vayne.web.domain.ExcelPoiReq;
import cn.vayne.web.domain.saas.OrderInfo;
import cn.vayne.web.repositorys.sass.OrderRepository;
import cn.vayne.web.repositorys.sassshop.ShopRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
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
	private OrderRepository orderRepository;

	@Autowired
	private ShopRepository shopRepository;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("getExcel")
	public void getExcel(ExcelPoiReq req, HttpServletResponse response, HttpServletRequest request) throws IOException {
		List<OrderInfo> entities = orderRepository.findAll();
		//List<ShopDO> shopDOS = shopRepository.findAll();
		String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		try(HSSFWorkbook workbook = new HSSFWorkbook()) {
			if(entities.size() > 0) {
				Sheet sheet = workbook.createSheet("测试数据统计表");
				sheet.setDefaultColumnWidth((short) 20);
				// 生成第一层标题样式
				CellStyle style = getHeadStyle(workbook);
				//正文样式
				CellStyle styleTable = getContentStyle(workbook);
				Row titleRow = sheet.createRow(sheet.getLastRowNum());
				String[] column = { "订单编号", "门店CRM","门店名称","省份","城市","门店地址","订单创建日期","订单支付日期	","订单核销日期","消费者姓名","消费者联系方式","价格","数量","支付金额","支付方式","订单状态","安装状态","是否有赠品","订单来源","消费者备注"};
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
			response.setContentType("application/x-excel;charset=UTF-8");
			String filename = "测试数据统计表"+dateTime+".xls";
			String agent = request.getHeader("user-agent");
			filename = encodeDownloadFilename(filename, agent);
			response.setHeader("Content-Disposition", "attachment;filename="
					+ filename);
			workbook.write(response.getOutputStream());
		}catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		/*ExcelPoiInfo excelPoiInfo = new ExcelPoiInfo();
		excelPoiInfo.put(10000,"ok");
		excelPoiInfo.put("flag",true);
		return excelPoiInfo;*/
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
	}

	public static String encodeDownloadFilename(String filename, String agent)
			throws IOException {
		filename = "=?gbk?B?"
				+ new BASE64Encoder().encode(filename.getBytes("gbk"))
				+ "?=";
		filename = filename.replaceAll("\r\n", "");
		return filename;
	}

	// 正文样式
	public CellStyle getContentStyle(HSSFWorkbook workbook){
		CellStyle style2 = workbook.createCellStyle();
		style2.setFillForegroundColor(HSSFColor.WHITE.index);
		style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		return style2;
	}

	public CellStyle getHeadStyle(HSSFWorkbook workbook) {
		// 生成第一层标题样式
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 生成字体
		Font font = workbook.createFont();
		font.setColor(HSSFColor.VIOLET.index);
		font.setFontHeightInPoints((short) 12);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	/**
	 * 创建文件夹
	 * @param filePath
	 * @throws IOException
	 */
	private void mkdirs(String filePath) throws IOException {
		File file = new File(filePath);
		if(!file.exists()){
			log.info("开始创建文件夹："+filePath);
			file.mkdirs();
			log.info("创建文件夹成功："+filePath);
		}
	}


	/***
	 * 创建表头
	 * @param workbook
	 * @param sheet
	 */
	private void createTitle(HSSFWorkbook workbook, HSSFSheet sheet)
	{
		HSSFRow row = sheet.createRow(0);
		//设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
		sheet.setColumnWidth(2, 12*256);
		sheet.setColumnWidth(3, 17*256);

		//设置为居中加粗
		HSSFCellStyle style = workbook.createCellStyle();
		HSSFFont font = workbook.createFont();
		font.setBold(true);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setFont(font);

		HSSFCell cell;
		cell = row.createCell(0);
		cell.setCellValue("序号");
		cell.setCellStyle(style);

		cell = row.createCell(1);
		cell.setCellValue("订单号");
		cell.setCellStyle(style);

		cell = row.createCell(2);
		cell.setCellValue("订单状态");
		cell.setCellStyle(style);

		cell = row.createCell(3);
		cell.setCellValue("支付方式");
		cell.setCellStyle(style);
	}


}
