package cn.vayne.test.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: WangKun
 * @Description: 日期工具类
 * @Date: Created in 2018/7/25 上午11:13
 * @ProjectName: saas-order-parent
 * @Version: 1.0.0
 */
@Slf4j
public class DateUtil {

	private static Calendar cal = new GregorianCalendar();

	/**
	 * 取开始时间
	 * @param dayFlag	与当前时间间隔差值,默认为0
	 * @return
	 */
	public static Date getDayBegin(Integer dayFlag){
		cal.setTime(initDayBegin());
		cal.add(Calendar.DAY_OF_MONTH,dayFlag);
		return cal.getTime();
	}

	/**
	 * 取结束时间
	 * @param dayFlag 与当前时间间隔差值,当天为0
	 * @return
	 */
	public static Date getDayEnd(Integer dayFlag){
		cal.setTime(initDayEnd());
		cal.add(Calendar.DAY_OF_MONTH,dayFlag);
		return cal.getTime();
	}

	private static Date initDayBegin() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	private static Date initDayEnd() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 59);
		return cal.getTime();
	}
}
