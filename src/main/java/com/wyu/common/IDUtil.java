package com.wyu.common;

import java.util.UUID;

//id工具类
public class IDUtil {
    /**
         * 获取uuid（以去掉'-'字符）

       **/
     public static String getUUID(){
             return UUID.randomUUID().toString().replace("-", "");
           }
}
