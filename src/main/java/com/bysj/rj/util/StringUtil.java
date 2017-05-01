package com.bysj.rj.util;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
public class StringUtil {
	private static final Logger logger = Logger.getLogger(StringUtil.class);
	public StringUtil() {
		// TODO Auto-generated constructor stub
	}

	public static String encode(String source, String from, String to) {
		byte[] bts;
		try {
			bts = source.getBytes(from);
			return new String(bts, to);
		} catch (UnsupportedEncodingException e) {
			logger.error("StringUtil异常",e);
			return null;
		}
	}

	public static boolean isEmpty(String str) {
		return (str == null) || ("".equals(str));
	}
	public static boolean isNull(String s) {
		if (s == null || "".equals(s.trim()) || "null".equals(s.trim())) {
			return true;
		}
		return false;
	}

	public static String join(String[] arr, String split) {
		if (arr != null && arr.length > 0) {
			StringBuilder stringBuilder = new StringBuilder();
			for (String s : arr) {
				stringBuilder.append(s).append(split);
			}
			stringBuilder.delete(stringBuilder.length() - split.length(),
					stringBuilder.length());
			return stringBuilder.toString();
		} else {
			return "";
		}
	}
	public static String join(Object[] arr, String split) {
		if (arr != null && arr.length > 0) {
			StringBuilder stringBuilder = new StringBuilder();
			for (Object s : arr) {
				stringBuilder.append(String.valueOf(s)).append(split);
			}
			stringBuilder.delete(stringBuilder.length() - split.length(),
					stringBuilder.length());
			return stringBuilder.toString();
		} else {
			return "";
		}
	}
	public static Properties parseProperties(String data , String split){
		Properties properties = new Properties();
		if(!StringUtil.isEmpty(split) && !StringUtil.isEmpty(data)){
			for (String dd : data.split(split)) {
				String[] d = dd.split("=");
				if(d.length==2){
					properties.put(d[0], d[1]);
				}
			}
		}
		return properties;
	}



	/**
	 * 判断字符串是否为空，不空返回，否则返回默认值
	 * 
	 * @param targetStr
	 *            目标字符串
	 * @param defaultStr
	 *            默认字符串
	 * @return 字符串
	 */
	public static String isEmpty(String targetStr, String defaultStr) {
		if (!StringUtils.isEmpty(targetStr)) {
			return targetStr;
		}
		return defaultStr;
	}

}
