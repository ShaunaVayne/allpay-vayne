package cn.vayne.test.demo;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/9/6 下午4:14
 * @ProjectName: allpay-vayne
 * @Version: 1.0.0
 */
public class DateUtil2 {

	/**
	 * 取开始时间
	 * @param dayFlag	与当前时间间隔差值,默认为0
	 * @return
	 */
	public static Date getDayBegin(Integer dayFlag){
		DateTime dt = new DateTime();
		dt =  dt.plusDays(dayFlag);
		Date date = dt.withTimeAtStartOfDay().toDate();
		return date;
	}

	/**
	 * 取结束时间
	 * @param dayFlag 与当前时间间隔差值,当天为0
	 * @return
	 */
	public static Date getDayEnd(Integer dayFlag){
		DateTime dt = new DateTime();
		dt =  dt.plusDays(dayFlag);
		Date date = dt.millisOfDay().withMaximumValue().toDate();
		return date;
	}
}
