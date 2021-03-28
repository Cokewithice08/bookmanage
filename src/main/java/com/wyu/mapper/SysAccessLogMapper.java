package com.wyu.mapper;

import java.util.List;
import java.util.Map;

public interface SysAccessLogMapper {
//    保存日志
     int saveSysLog(Map<String,Object> map);
//     查询系统访问日志列表
     List<Map<String,Object>> querySysLogList(Map<String,Object> map);
}
