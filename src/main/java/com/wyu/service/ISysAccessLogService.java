package com.wyu.service;

import java.util.Map;

public interface ISysAccessLogService {
//    保存日志
    int saveSysLog(Map<String,Object> map);
//    查看日志列表
    Map<String,Object> querySysLogList(Map<String,Object> map);
}
