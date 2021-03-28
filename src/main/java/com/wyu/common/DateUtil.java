package com.wyu.common;

import java.text.SimpleDateFormat;
import java.util.Date;

//日期工具类
public class DateUtil {
//返回字符串的当前时间
//    yyyy-mm-dd
    public static  String getCurrentDateStr(String pattern){
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        String currentDateStr = format.format(new Date());
        return currentDateStr;
    }
}
