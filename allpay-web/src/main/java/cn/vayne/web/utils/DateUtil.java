package cn.vayne.web.utils;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * @Author: WangKun
 * @Description: 日期工具类
 * @Date: Created in 2018/7/25 上午11:13
 * @ProjectName: saas-order-parent
 * @Version: 1.0.0
 */
@Slf4j
public class DateUtil {

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
