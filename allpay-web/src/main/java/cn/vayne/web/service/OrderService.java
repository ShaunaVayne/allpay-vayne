package cn.vayne.web.service;

import cn.vayne.web.domain.ExcelPoiReq;
import cn.vayne.web.domain.saas.OrderInfo;
import cn.vayne.web.domain.saasshop.ShopDO;
import cn.vayne.web.repositorys.sass.OrderRepository;
import cn.vayne.web.repositorys.sassshop.ShopRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/6/22 下午2:46
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
@Service
@Slf4j
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ShopRepository shopRepository;

	public HSSFWorkbook getExcel(ExcelPoiReq req) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		List<OrderInfo> entities = orderRepository.findAll();
		List<ShopDO> shopDOS = shopRepository.findAll();
		HashMap<String, ShopDO> shopMaps = new HashMap<>();
		for (ShopDO shopDO : shopDOS) {
			shopMaps.put(String.valueOf(shopDO.getId()),shopDO);
		}
		try {
			if(entities.size() > 0) {
				Sheet sheet = workbook.createSheet("订单统计表");
				sheet.setDefaultColumnWidth((short) 20);
				log.info("门店:{}","ok");
				int a = 10 / 0;
				// 生成第一层标题样式
				CellStyle style = getHeadStyle(workbook);
				//正文样式
				CellStyle styleTable = getContentStyle(workbook);
				Row titleRow = sheet.createRow(sheet.getLastRowNum());
				// TODO  用户id
				String[] column = { "订单编号","用户昵称","门店CRM","门店名称","省份","城市","门店地址","订单创建日期","订单支付日期	","订单核销日期","消费者姓名","消费者联系方式","价格","数量","支付金额","支付方式","订单状态","安装状态","是否有赠品","订单来源","消费者备注"};
				Cell cellTitle = null;
				for (int i = 0; i < column.length; i++) {
					cellTitle = titleRow.createCell(i);
					cellTitle.setCellValue(column[i]);
					cellTitle.setCellStyle(style);
				}
				Cell cellTable = null;
				for (OrderInfo entity : entities) {
					Long shopId = entity.getShopId();
					ShopDO shopDO = null;
					if(shopId != null) {
						Set<String> shopIds = shopMaps.keySet();
						if(shopIds.contains(shopId)) {
							shopDO = shopMaps.get(shopId);
						}else {
							shopDO = new ShopDO();
						}
					}else {
						shopDO = new ShopDO();
					}
					Row dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
					cellTable = dataRow.createCell(0);//订单编号
					cellTable.setCellValue(entity.getOrderNo());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(1);//用户昵称
					cellTable.setCellValue(entity.getUserId());
					cellTable.setCellStyle(styleTable);



					cellTable = dataRow.createCell(2);//门店CRM
					cellTable.setCellValue(shopDO.getCrm() == null ? "" : shopDO.getCrm());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(3);//门店名称
					cellTable.setCellValue(shopDO.getName() == null ? "" : shopDO.getName());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(4);//省份
					cellTable.setCellValue(shopDO.getProvince() == null ? "" : shopDO.getProvince());
					cellTable.setCellStyle(styleTable);


					cellTable = dataRow.createCell(5);//城市
					cellTable.setCellValue(shopDO.getCity() == null ? "" : shopDO.getCity());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(6);//门店地址
					cellTable.setCellValue(shopDO.getAddress() == null ? "" : shopDO.getAddress());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(7);//订单创建日期
					cellTable.setCellValue(entity.getCreatedTime());
					cellTable.setCellStyle(styleTable);

					// TODO 支付时间字段待确认
					cellTable = dataRow.createCell(8);//订单支付日期
					cellTable.setCellValue(entity.getCreatedTime());
					cellTable.setCellStyle(styleTable);


					cellTable = dataRow.createCell(9);//订单核销日期
					cellTable.setCellValue(entity.getFinishTime());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(10);//消费者姓名
					cellTable.setCellValue(entity.getReceiverUserName());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(11);//消费者联系方式
					cellTable.setCellValue(entity.getReceiverMobile());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(12);//价格
					cellTable.setCellValue(entity.getItemAmount());
					cellTable.setCellStyle(styleTable);

					//TODO 数量待定
					cellTable = dataRow.createCell(13);//数量
					cellTable.setCellValue(entity.getFinishTime());
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(14);//支付金额
					cellTable.setCellValue(entity.getActualPayment());
					cellTable.setCellStyle(styleTable);

					String paymentType = entity.getPaymentType();
					if(StringUtils.isNotBlank(paymentType)) {
						switch (paymentType) {
							case "OFFLINE" :
								paymentType = "线下/到店支付";
								break;
							case "ONLINE" :
								paymentType = "线上/在线支付";
								break;
							default:
								paymentType = "";
						}
					}
					cellTable = dataRow.createCell(15);//支付方式
					cellTable.setCellValue(paymentType);
					cellTable.setCellStyle(styleTable);

					String orderStatus = entity.getOrderStatus();
					if(StringUtils.isNotBlank(orderStatus)) {
						switch (orderStatus) {
							case "UNPAID":
								orderStatus = "待支付";
								break;
							case "PAID":
								orderStatus = "已支付";
								break;
							case "FINISHED":
								orderStatus = "已完成";
								break;
							case "CANCEL":
								orderStatus = "已取消";
								break;
							default:
								orderStatus = "";
						}
					}

					cellTable = dataRow.createCell(16);//订单状态
					cellTable.setCellValue(orderStatus);
					cellTable.setCellStyle(styleTable);

					String serviceStatus = entity.getServiceStatus();
					if(StringUtils.isNotBlank(serviceStatus)) {
						switch (serviceStatus) {
							case "SEND_BILL":
								serviceStatus = "派单中";
								break;
							case "BE_SEND_BILL":
								serviceStatus = "待派单";
								break;
							case "BE_RESERVED":
								serviceStatus = "待预约";
								break;
							case "BE_INSTALLED":
								serviceStatus = "待安装";
								break;
							case "INSTALLING":
								serviceStatus = "安装完成";
								break;
							case "CANCEL":
								serviceStatus = "取消";
								break;
							default:
								serviceStatus = "";
						}
					}
					cellTable = dataRow.createCell(17);//安装状态
					cellTable.setCellValue(serviceStatus);
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(18);//是否有赠品
					cellTable.setCellValue(entity.getIsGift().equals("Y") ? "是" : "否");
					cellTable.setCellStyle(styleTable);

					String sourceType = entity.getSourceType();
					if(StringUtils.isNotBlank(sourceType)) {
						switch (sourceType) {
							case "IOS_VIEW":
								sourceType = "IOS微信小程序";
								break;
							case "ANDROID_VIEW":
								sourceType = "安卓微信小程序";
								break;
							default:
								sourceType = "";
						}
					}
					cellTable = dataRow.createCell(19);//订单来源
					cellTable.setCellValue(sourceType);
					cellTable.setCellStyle(styleTable);

					cellTable = dataRow.createCell(20);//消费者备注
					cellTable.setCellValue(entity.getRemark());
					cellTable.setCellStyle(styleTable);
				}
			}else {
				Sheet sheet = workbook.createSheet("卡密重置明细数据");
				Row headRow = sheet.createRow(0);
				headRow.createCell(0).setCellValue(
						"数据为空 或查询方式错误请重新查询并导出" + "##请优先点击查询按钮 再点击导出");
			}
		}catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		return workbook;
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
}
