package com.aron.minimallog.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className: DateUtil
 * @description:
 * @author: salad
 * @date: 2022/5/4
 **/
public class DateUtil {

    public static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";
    public static final String PATTERN_DATE = "yyyy-MM-dd";
    public static final String PATTERN_TIME = "HH:mm:ss";

    public static Date parse(String target,String pattern){
        try {
            return new SimpleDateFormat(pattern).parse(target);
        } catch (ParseException e) {
            throw new RuntimeException("解析日期失败！",e);
        }
    }

    public static Date now() {
        return new Date();
    }


}
