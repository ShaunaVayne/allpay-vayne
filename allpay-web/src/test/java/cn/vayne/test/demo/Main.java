package cn.vayne.test.demo;

import cn.vayne.test.domain.Apple;
import cn.vayne.test.domain.PurchaseProductReq;
import cn.vayne.test.domain.VehicleV1;
import cn.vayne.test.domain.VehicleV2;
import cn.vayne.web.config.ApplicationContextProvider;
import cn.vayne.web.domain.DTO.ExcelPoiReq;
import cn.vayne.web.domain.DTO.TestReq2;
import cn.vayne.web.service.ExcelPoiService;
import cn.vayne.web.service.ExcelPoiTask;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.assertj.core.util.Lists;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	private static Calendar cal = new GregorianCalendar();

	private static final String FORMATE_DATE = "yyyy-MM-dd";
	private static final String FORMATE_SECONDS = "HH:mm:ss";
	private static final String FORMATE_FULL = FORMATE_DATE.concat(" ").concat(FORMATE_SECONDS);


	public static final String orderCodePrefix = "THD";

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
		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR, 0);
		todayStart.set(Calendar.MINUTE, 0);
		todayStart.set(Calendar.SECOND, 0);
		todayStart.set(Calendar.MILLISECOND, 0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(todayStart.getTime()));
	}

	/**
	 * 昨天
	 */
	@Test
	public void test6() {
		Calendar cal = new GregorianCalendar();
		cal.setTime(getDayBegin());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));//2018-07-24 00:00:00
	}

	@Test
	public void test7() {
		Calendar cal = new GregorianCalendar();
		cal.setTime(getDayEnd());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));//2018-07-24 23:59:59
	}

	/**
	 * 7天
	 */
	@Test
	public void test8() {
		//Calendar cal = new GregorianCalendar();
		cal.setTime(getDayEnd());
		cal.add(Calendar.DAY_OF_MONTH, -7);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));//2018-07-24 23:59:59

		cal.setTime(getDayBegin());
		cal.add(Calendar.DAY_OF_MONTH,0);
		System.out.println(sdf.format(cal.getTime()));//2018-06-25 00:00:00
	}



	public static Date getDayBegin() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static Date getDayEnd() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 59);
		return cal.getTime();
	}

	@Test
	public void test10() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(DateUtil.getDayBegin(-7));
		System.out.println(format);
		System.out.println(sdf.format(DateUtil.getDayEnd(-1)));
	}

	@Test
	public void test11() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 5; i++) {
			sb.append(i+",");
		}
		String substring = sb.toString().substring(0, sb.toString().length() - 1);
		System.out.println(substring);

	}

	@Test
	public void test12() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = "2018-08-17 00:00:00";
		Date parse = format.parse(str);
		log.info("sss"+parse);
	}

	@Test
	public void test13() {
		TestReq2 main1 = new TestReq2("wangkun1", 1, "sh1");
		TestReq2 main2 = new TestReq2("wangkun2", 2, "sh2");
		TestReq2 main3 = new TestReq2("wangkun3", 3, "sh3");
		TestReq2 main4 = new TestReq2("wangkun4", 4, "sh4");
		List<TestReq2> list = Arrays.asList(main1, main2, main3, main4);

		TestReq2 entity1 = new TestReq2("vayne1", 1, "bj1");
		TestReq2 entity2 = new TestReq2("vayne2", 2, "bj2");
		//TestReq2 entity3 = new TestReq2("vayne3", 3, "bj3");
		TestReq2 entity3 = new TestReq2("wangkun3", 3, "sh3");
		TestReq2 entity4 = new TestReq2("vayne4", 4, "bj4");

		List<TestReq2> list1 = Arrays.asList(entity1, entity2, entity3, entity4);

		Map<Integer, List<TestReq2>> listDiff = findListDiff(list, list1);
		System.out.println(listDiff);
	}

	@Test
	public void test14() {
		DateTime dateTime = new DateTime();
		dateTime = dateTime.plusMonths(-1);
		System.out.println(dateTime.toString("yyyy-MM-dd HH:mm:ss"));

		DateTime dt = new DateTime();
		dt = dt.plusDays(-30);
		//dt = dt.plusMonths(-1);
		System.out.println(dt.withTimeAtStartOfDay().toDate());
		System.out.println(dt.withTimeAtStartOfDay().toString(FORMATE_FULL));
		System.out.println(dt.millisOfDay().withMaximumValue().toString(FORMATE_FULL));

	}

	@Test
	public void test15() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dayBegin = DateUtil2.getDayBegin(-1);
		Date dayEnd = DateUtil2.getDayEnd(-1);
		System.out.println(sdf.format(dayBegin));
		System.out.println(sdf.format(dayEnd));

	}

	@Test
	public void test16() {
		//String msg = "17621749522aa";
		String msg = "";
		String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(msg);
		System.out.println(m.matches());

		Req req = new Req();
		req.setPageNum(2);
		log.info("req:{}",req);
	}

	@Test
	public void test17() {
		VehicleV2 vehicleV21 = new VehicleV2(1l, "京888", "京");
		VehicleV2 vehicleV22 = new VehicleV2(2l, "京888", "京1");
		VehicleV2 vehicleV23 = new VehicleV2(3l, "京888", "京1");
		List<VehicleV2> vehicleV2s = new ArrayList<>();
		vehicleV2s.add(vehicleV21);
		vehicleV2s.add(vehicleV22);
		vehicleV2s.add(vehicleV23);
		//vehicleV2s.stream().filter(e -> e.getId().equals(e.getId()) && )
		System.out.println(vehicleV2s.size());
		Set<VehicleV2> vehicleV2s1 = new HashSet<>();
		vehicleV2s1.add(vehicleV21);
		vehicleV2s1.add(vehicleV22);
		vehicleV2s1.add(vehicleV23);
//		vehicleV2s1.addAll(vehicleV2s);
		System.out.println(vehicleV2s1.size());

	}

	@Test
	public void test19() {
		String key  = "THD20181028";
		Date dayBegin = cn.vayne.web.utils.DateUtil.getDayBegin(-1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String format = sdf.format(dayBegin);
		System.out.println(format);
	}

	@Test
	public void test20() {
		String orderCode = "0001";
		Date dayBegin = cn.vayne.web.utils.DateUtil.getDayBegin(0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String format = sdf.format(dayBegin);
		orderCode = orderCodePrefix + format + orderCode;
		System.out.println(orderCode);

	}

	@Test
	public void test21() {
		PurchaseProductReq req1 = new PurchaseProductReq();
		PurchaseProductReq req2 = new PurchaseProductReq();
		req1.setProductPrice(1l);
		req1.setQuantityLimit(10);
		req1.setQuantityExpect(10);

		req2.setProductPrice(2l);
		req2.setQuantityLimit(20);
		req2.setQuantityExpect(20);

		List<PurchaseProductReq> reqs = Arrays.asList(req1, req2);

		Long amountRelease = 0l; //实收/退金额
		Long amountExpect = 0l; //应收/退金额

		for (PurchaseProductReq req : reqs) {
			Long productPrice = req.getProductPrice();
			Integer quantityLimit = req.getQuantityLimit();//
			Integer quantityExpect = req.getQuantityExpect();
			Long quantityLimitSum = productPrice * quantityLimit;//可退数量
			Long quantityExpectSum = productPrice * quantityExpect;//退货数量
			amountRelease += quantityExpectSum;
			amountExpect += quantityLimitSum;
		}

		log.info("amountRelease:{},amountExpect:{}", amountRelease, amountExpect);

	}

	@Test
	public void test22() {
		String s =  "";
		if(StringUtils.isNotBlank(s)) {
			System.out.println("ok");
		}else {
			System.out.println("not ok");
		}

	}

	@Test
	public void test23() {
		System.out.println(new Date());
		String bookBeginusetime = "2018-09-25 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Long beginUseTime = sdf.parse(bookBeginusetime).getTime();
			log.info("bookBeginusetime:{}", bookBeginusetime);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String startDate = "2017-08-15";
		String endDate = "2017-08-15";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		int startDay = 0;
		int endDay = 0;

		try {
			Date dateStart = format.parse(startDate);
			Date datEnd = format.parse(endDate);

			startDay = (int) (dateStart.getTime() / 1000);
			endDay = (int) (datEnd.getTime() / 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println(startDay);
		System.err.println(endDay);
	}


	@Test
	public void test18() {
		VehicleV1 v1 = new VehicleV1();
		v1.setId(1l);
		v1.setLicensePlateFlag("京");
		v1.setLicensePlateNumber("11");
		v1.setVehicleModel("11");
		v1.setColor("aaa");

		VehicleV1 v2 = new VehicleV1();
		v2.setId(2l);
		v2.setLicensePlateFlag("京");
		v2.setLicensePlateNumber("11");
		v2.setVehicleModel("11");

		VehicleV1 v3 = new VehicleV1();
		v3.setId(3l);
		v3.setLicensePlateFlag("京");
		v3.setLicensePlateNumber("22");
		v3.setVehicleModel("22");

		List<VehicleV1> v1s = new ArrayList<>();
		v1s.add(v1);
		v1s.add(v2);
		v1s.add(v3);

		System.out.println(v1s.size());



		Set<VehicleV1> v2s = new HashSet<>();
		v2s.addAll(v1s);
		System.out.println(v2s.size());



	}

	@Test
	public void test24() {
		Long l = 1542167322205000L;
		String id = String.valueOf(l);
		String time = "2018-11-14";

	}

	@Test
	public void test26() {
		String a = null;

		String b = "";

		String c = "1";

		if (StringUtils.isNotEmpty(b)) {
			System.out.println("okk");
		}

		if(b != null) {
			System.out.println("ok222");
		}

		List<String> list = new ArrayList<>();

		if(list.isEmpty()) {
			System.out.println("空");
		}
	}

	@Test
	public void test25() {
		ArrayList<Apple> inventory = Lists.newArrayList(
				new Apple(5, "red"),
				new Apple(5, "aed"),
				new Apple(1, "green"),
				new Apple(15, "green"),
				new Apple(2, "red"));
		inventory.sort((a, b) -> a.getWeight() - b.getWeight());

		System.out.println(inventory);

	}


	private Map<Integer, List<TestReq2>> findListDiff(List<TestReq2> rps1, List<TestReq2> rps2){
		//判断不能为空
		if(rps1 == null || rps1.isEmpty() || rps2 == null || rps1.isEmpty()) return null;
		//保存最后的数据
		Map<Integer, List<TestReq2>>  mapList = new HashMap<Integer, List<TestReq2>>(3);

		//复制rps1，作为备份
		List<TestReq2> rps1_bak = new ArrayList<TestReq2>(rps1);

		//1、获取rps1中与rps2中不同的元素
		rps1.removeAll(rps2);

		//2、获取rps1和rps2中相同的元素
		rps1_bak.removeAll(rps1);

		//3、获取rps2中与rps1中不同的元素
		rps2.removeAll(rps1_bak);

		//经过此转换后rps1中数据与rps2中的数据完全不同
		//rps1_bak是rps1和rps2的交集
		//rps2中的数据与rps1中的数据完全不同

		mapList.put(0, rps1);//rps1中独有的数据
		mapList.put(1, rps1_bak);//交集的数据
		mapList.put(2, rps2);//rps2中的独有数据


		return mapList;
	}




}
