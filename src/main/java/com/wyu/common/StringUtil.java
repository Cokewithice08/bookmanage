package com.wyu.common;


import eu.bitwalker.useragentutils.UserAgent;

import javax.servlet.http.HttpServletRequest;

//字符串的工具类
public class StringUtil {
//    浏览器和系统信息

    public static String getBrowserSystemInfo(HttpServletRequest request) {
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("user-agent"));
        String BSInfo = userAgent.getOperatingSystem() + "-" + userAgent.getBrowser() + "(" + userAgent.getBrowserVersion() + ")";
        return BSInfo;
    }
}
