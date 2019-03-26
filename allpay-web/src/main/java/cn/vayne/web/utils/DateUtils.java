package cn.vayne.web.utils;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/10/23 下午6:39
 * @ProjectName: saas-purchase
 * @Version: 1.0.0
 */
@Slf4j
public class DateUtils {

    public static final String LONG_DISPLAY_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String SHORT_DISPLAY_PATTERN = "yyyy-MM-dd";

    public static String formateToString(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String format = sdf.format(date);
        return format;
    }


    public static String getDate(Integer i) {
        Date dayBegin = getDayBegin(i);
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String format = sdf.format(dayBegin);
        return format;
    }

    /**
     * 取开始时间
     *
     * @param dayFlag 与当前时间间隔差值,默认为0
     * @return
     */
    public static Date getDayBegin(Integer dayFlag) {
        DateTime dt = new DateTime();
        dt = dt.plusDays(dayFlag);
        Date date = dt.withTimeAtStartOfDay().toDate();
        return date;
    }

    public static Date stringConventDate(String dataStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(dataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将时间戳转化为 Date
     */
    public static Date parse(long timeStamp) {
        SimpleDateFormat s = new SimpleDateFormat(LONG_DISPLAY_PATTERN);
        String dateStr = s.format(timeStamp);
        return parse(dateStr);
    }

    /**
     * 将格式为【yyyy-MM-dd HH:mm:ss】的字符串转换为日期
     *
     * @param date
     * @return
     */
    public static Date parse(String date) {
        try {
            return parse(date, LONG_DISPLAY_PATTERN);
        } catch (Exception e) {
            return parse(date, SHORT_DISPLAY_PATTERN);
        }
    }

    /**
     * 按指定格式，将字符串转换为日期
     *
     * @param date
     * @param pattern
     * @return
     */
    public static Date parse(String date, String pattern) {
        try {
            return new SimpleDateFormat(pattern).parse(date);
        } catch (ParseException e) {
            log.error("解析字符串【" + date + "】为【" + pattern + "】格式的日期对象时发生异常：", e);
        }

        return null;
    }

    /**
     * 获取从今天起 N 周 以后的日期
     *
     * @param ExpiryPeriod
     * @return
     */
    public static Date getNowPlusWeeks(Integer ExpiryPeriod) {
        Date date = Date.from(Instant.now().plus(ExpiryPeriod * 7, DAYS));
        return date;
    }


    /**
     * 取指定日期零点
     *
     * @return
     */
    public static Date getDateZeroTime(Date date) {
        Calendar calendar = new Calendar.Builder().setInstant(date).build();

        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);

        return calendar.getTime();
    }

    /**
     * 取指定日期起始点
     *
     * @return
     */
    public static Date getDateStartTime(Date date) {
        Calendar calendar = new Calendar.Builder().setInstant(date).build();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static void main(String[] args) {

    }
}
