package com.bysj.rj.util;

import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 通用日期处理类
 * 
 * @author zhangwan
 * @email zhangwan@58.com Jun 10, 2010 5:03:18 PM
 */
public class DateBuilder {
	private static Logger logger = Logger.getLogger(DateBuilder.class);
	private static DateBuilder instance;
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String YYYY_MM_DD_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYY_MM_DD_HH_mm = "yyyy-MM-dd HH:mm";
	/**
	 * 格式化字符串-日期天开始时刻
	 */
	public static final String FORMAT_DAY_BEGIN = "yyyy-MM-dd 00:00:00";
	/**
	 * 格式化字符串-日期天结束时刻
	 */
	public static final String FORMAT_DAY_END = "yyyy-MM-dd 23:59:59";

	public DateBuilder() {
	}
	public static DateBuilder getInstance() {
		if (instance == null) {
			instance = new DateBuilder();
		}
		return instance;
	}
	public static Date getDate(String sFormat, String date) {
		if (date == null || "".equals(date)) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(sFormat);
		try {
			return formatter.parse(date);
		} catch (ParseException e) {
			logger.error("时间转换异常",e);
		}
		return null;
	}
	/**
	 * 取得系统当前时间
	 * @return String yyyy-mm-dd
	 */
	public static String getCurrentDate_Simple() {
		Calendar rightNow = Calendar.getInstance();
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		int day = rightNow.get(Calendar.DATE);
		return convertDateToString(convertStringToDate(year + "-" + month + "-" + day));
	}
	/**
	 * 取得系统当前时间的前n秒
	 * @param second int
	 */
	public static Date getSecBeforeCurrentDate(int second) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.SECOND, - second);
		return c.getTime();
	}
	/**
	 * 获取现在时间
	 * @return 返回时间字符串 yyyy-MM-dd HH:mm:ss
	 */
	public static String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
		return format.format(date);
	}

	/**
	 * 获取时间字符串
	 * @return 返回时间字符串 yyyy-MM-dd HH:mm:ss
	 */
	public static String getDateString(Date date) {
		if(date == null){
			return "";
		}
		SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
		return format.format(date);
	}
	/**
	 * 获取现在时间
	 * @return 返回时间字符串 yyyy-MM-dd HH:mm:ss
	 */
	public static String getCurrentDate(String fm) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat(fm);
		return format.format(date);
	}
	/**
	 * 获取现在时间
	 * @return 返回时间字符串 yyyy-MM-dd HH:mm:ss
	 */
	public static String getDateToString(Date time, String fm) {
		if(null==time||StringUtil.isNull(fm)){
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat(fm);
		return format.format(time);
	}
	/**
	 * 获取现在时间
	 * @return 返回时间字符串 yyyy-MM-dd HH:mm:ss
	 */
	public static String getDateByLongTime(long time) {
		Date date = new Date(time);
		SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
		return format.format(date);
	}


	/**
	 * 获取指定时间天
	 */
	public static int getDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int day = c.get(Calendar.DAY_OF_MONTH);
		return day;
	}

	/**
	 * 取得系统当前时间后n天
	 * @param day    int
	 * @return String yyyy-mm-dd
	 */
	public static String getDayAfterCurrentDate(int day) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, day);
		return convertDateToString(convertStringToDate("" + c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE)));
	}

	/**
	 * 取得当前时间前n天的时间
	 * @param day
	 * @return yyyy-MM-dd HH:mm:ss
	 * @throws ParseException
	 */
	public static Date getDateTimeBeforeCurrentDate(int day) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -day);
		return c.getTime();
	}

	/** * 获取指定日期是星期几
	  * 参数为null时表示获取当前日期是星期几
	  * @param date
	  * @return
	*/
	public static String getWeekOfDate(Date date) {      
	    String[] weekOfDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};        
	    Calendar calendar = Calendar.getInstance();      
	    if(date != null){        
	         calendar.setTime(date);      
	    }        
	    int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;      
	    if (w < 0){        
	        w = 0;      
	    }      
	    return weekOfDays[w];    
	}

	/**
	 * 将一个日期字符串转化成日期
	 * @param strDate     String
	 * @return Date yyyy-mm-dd
	 */
	public static Date convertStringToDate(String strDate) {
		Date date = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat(YYYY_MM_DD);
			date = df.parse(strDate);
		} catch (Exception e) {
			logger.error("日期转换失败1:",e);
		}
		return date;
	}

	public static Date convertStringToDate2(String strDate) {
		Date date = null;
		try {
			if("".equals(strDate)){
				strDate = getCurrentDate();
			}
			SimpleDateFormat df = new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
			date = df.parse(strDate);
		} catch (Exception e) {
			logger.error("日期转换失败3:",e);
		}
		return date;
	}
	/**
	 * 输入两个字符串型的日期，比较两者的大小
	 * @param fromDate     String
	 * @param toDate    String
	 * @return boolean before为true
	 */
	public static boolean compareTwoDateBigOrSmall(String fromDate, String toDate) {
		Date dateFrom = convertStringToDate(fromDate);
		Date dateTo = convertStringToDate(toDate);
		if (dateFrom.before(dateTo)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 输入两个字符串型的日期，判断是否包含当前日期
	 * @param bDate     String
	 * @param eDate    String
	 * @return boolean before为true
	 */
	public static boolean compareTwoDatebewNewDate(String bDate, String eDate) {
		Date dateFrom = convertStringToDate(bDate);
		Date dateTo = convertStringToDate(eDate);
		if (dateFrom.before(new Date())&&new Date().before(dateTo)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 输入两个字符串型的日期，比较两者的大小
	 * @param dateone   String
	 * @param datetwo   String
	 * @return -1 1<2 0 1=2 1 1>2 else -2
	 */
	public static int compareDate(String dateone, String datetwo) {
		Date date1 = new Date();
		Date date2 = new Date();
		SimpleDateFormat df = new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
		try {
			date1 = df.parse(dateone);
			date2 = df.parse(datetwo);
			if (date1.before(date2)) {
				return -1;
			} else if (date1.equals(date2)) {
				return 0;
			} else if (date1.after(date2)) {
				return 1;
			}
		} catch (ParseException e) {
			logger.error("比较时间异常",e);
		}
		return -2;
	}

	/**
	 * 将一个日期字符串转化成Calendar
	 * @param strDate String
	 * @return Calendar
	 */
	public static Calendar convertDateStringToCalendar(String strDate) {
		Date date = convertStringToDate(strDate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	/**
	 * 取得某个特定时间前N小时的时间
	 * @param strDate  String
	 * @param hour  int
	 * @return yyyy-mm-dd HH:mm:ss
	 */
	public static String getDayOfHourBefore(String strDate, int hour) {
	    String time ;
		Date date ;
		try {
			SimpleDateFormat df = new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
			date = df.parse(strDate);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.HOUR, -hour);
		    time =  new  SimpleDateFormat( YYYY_MM_DD_HH_mm_ss ).format(c.getTime());//获取到完整的时间
		    return  time;
		} catch (Exception e) {
			logger.error("日期转换失败4:",e);
		}
		return strDate;
	}
	/**
	 * 取得某个特定时间前N分钟的时间
	 * @param strDate
	 * @param min
	 * @return
	 */
	public static String getDayOfMinBefore (String strDate,int min) {
        String time ;
        Calendar cal = Calendar. getInstance ();
        cal.add(Calendar.MINUTE , -min ) ; //把时间设置为当前时间-min分钟，同理，也可以设置其他时间
        time =  new  SimpleDateFormat( YYYY_MM_DD_HH_mm_ss ).format(cal.getTime());//获取到完整的时间
        return  time;
    }

	/**
	 * 取得某个特定时间前n天,格式为yyyy-mm-dd
	 * @param strDate     String
	 * @param day     int
	 * @return yyyy-mm-dd
	 */
	public static String getDayBeforeSpecificDate(String strDate, int day) {
		Calendar c = convertDateStringToCalendar(strDate);
		c.add(Calendar.DAY_OF_MONTH, -day);
		return convertDateToString(convertStringToDate("" + c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE)));
	}
	/**
	 * 取得某个时间后n天,格式为yyyy-mm-dd
	 * @param strDate     String
	 * @param day   int
	 * @return yyyy-mm-dd
	 */
	public static String getDayAfterSpecificDate(String strDate, int day) {
		Calendar c = convertDateStringToCalendar(strDate);
		c.add(Calendar.DAY_OF_MONTH, day);
		return convertDateToString(convertStringToDate("" + c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE)));
	}

	/**
	 * 将日期转化为字符串
	 * @param date
	 * @return
	 */
	public static String convertDateToString(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_MM_DD);
		return dateFormat.format(date);
	}

	/**
	 * 将日期转化为字符串返回年月
	 * @param date
	 * @return
	 */
	public static String convertDateToStringStrForyy(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
		return dateFormat.format(date);
	}
	/**
	 * 将日期转换为字符串
	 * @param date      日期
	 * @param pattern     格式字符串
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {
		if (date == null)
			return "";
		if (pattern == null || "".equals(pattern)) {
			pattern = YYYY_MM_DD;
		}
		SimpleDateFormat dateFormat ;
		try {
			dateFormat = new SimpleDateFormat(pattern);
			return dateFormat.format(date);
		} catch (Exception e) {
			logger.error("异常",e);
			dateFormat = new SimpleDateFormat(YYYY_MM_DD);
			return dateFormat.format(date);
		}
	}
	/**
	 * 获取指定时间月份
	 */
	public static int getMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int month = c.get(Calendar.MONTH) + 1;
		return month;
	}

	public static String addHour(String strDate,int i) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
		Date date = sdf.parse(strDate);
		Calendar cal = Calendar.getInstance();  
		cal.setTime(date);  
		cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) + i);
		return sdf.format(cal.getTime());
	}
	/**
	 * 加/减分钟
	 * @param date
	 * @param i
	 * @return
	 */
	public static Date addMin(Date date,int i) throws ParseException
	{
		Calendar cal = Calendar.getInstance();  
		cal.setTime(date);  
		cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) + i);
		return cal.getTime();
	}

	/**
	 * 得到日期天开始时刻字符串
	 * @param date 日期实例
	 * @return 格式化字符串 ("yyyy-MM-dd 00:00:00")
	 */
	public static String toDayBeginStr(Date date) {
		return new SimpleDateFormat(FORMAT_DAY_BEGIN).format(date);
	}
	/**
	 * 得到日期天结束时刻字符串
	 * @param date 日期实例
	 * @return 格式化字符串 ("yyyy-MM-dd 23:59:59")
	 */
	public static String toDayEndStr(Date date) {
		return new SimpleDateFormat(FORMAT_DAY_END).format(date);
	}
	/**
	 * 转化字符串到日期实例
	 * @param dateStr 日期字符串
	 * @param format 格式字符串
	 * @return 日期实例
	 * @throws ParseException
	 *             转化异常
	 */
	public static Date toDate(String dateStr, String format) throws ParseException {
		return new SimpleDateFormat(format).parse(dateStr);
	}

	/**
	 * 转化字符串到日期实例
	 * @param dateStr 字符串格式(yyyy-MM-dd HH:mm:ss)
	 * @return 日期实例
	 * @throws ParseException 转化异常
	 */
	public static Date toDate(String dateStr) throws ParseException {
		return toDate(dateStr, YYYY_MM_DD_HH_mm_ss);
	}

	/**
	 * 得到日期标准字符串
	 * @param date 日期实例
	 * @return 格式化字符串 (yyyy-MM-dd HH:mm:ss)
	 */
	public static String toStr(Date date) {
		return new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss).format(date);
	}

    /** 
     * 计算两个日期之间相差的小时分钟数 
     * @param smDate 较小的时间
     * @param bDate  较大的时间
     * @return 相差天数
	 * @throws ParseException 
     */  
    public static String daysBetweenToMin(Date smDate,Date bDate) throws ParseException  
    {  
    	SimpleDateFormat sdf=new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
    	smDate=sdf.parse(sdf.format(smDate));
    	bDate=sdf.parse(sdf.format(bDate));
        Calendar cal = Calendar.getInstance();  
        cal.setTime(smDate);  
        long time1 = cal.getTimeInMillis();               
        cal.setTime(bDate);  
        long time2 = cal.getTimeInMillis();       
        long betweenmins=(time2-time1)/(1000*60);
        logger.info(betweenmins);
        return    betweenmins/60+"小时"+betweenmins%60+"分钟";
    }  
    
    /** 
     * 计算两个日期之间相差的分钟数 
     * @param smDate 较小的时间
     * @param bDate  较大的时间
     * @return 相差天数
	 * @throws ParseException 
     */  
    public static long daysBetweenToOnlyMin(Date smDate,Date bDate) throws ParseException  
    {  
    	SimpleDateFormat sdf=new SimpleDateFormat(YYYY_MM_DD_HH_mm_ss);
    	smDate=sdf.parse(sdf.format(smDate));
    	bDate=sdf.parse(sdf.format(bDate));
        Calendar cal = Calendar.getInstance();  
        cal.setTime(smDate);  
        long time1 = cal.getTimeInMillis();               
        cal.setTime(bDate);  
        long time2 = cal.getTimeInMillis();       
        long betweenmins=(time2-time1)/(1000*60);
        logger.info(betweenmins);
        return  betweenmins;
    }

      /**
    	 * 输入两个date类型的日期，判断当前日期是否在时间段内
    	 * @param fromDate date
    	 * @param toDate  date
    	 * @return boolean 包含为true
    	 */
    	public static boolean compareTwoDateIncludeNewDate(Date fromDate, Date toDate) {
    		if (fromDate.before(new Date())&&new Date().before(toDate)) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    	/**
  	 * 输入date类型的日期，判断当前日期是否大于输入日期
  	 * @param fromDate date
  	 * @return boolean 包含为true
  	 */
  	public static boolean compareDateBeforeNewDate(Date fromDate) {
  		if (fromDate.before(new Date())) {
  			return true;
  		} else {
  			return false;
  		}
  	}
}
