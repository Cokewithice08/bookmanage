package com.wyu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyu.mapper.SysAccessLogMapper;
import com.wyu.service.ISysAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SysAccessLogServiceImpl implements ISysAccessLogService {

    @Autowired
    private SysAccessLogMapper sysAccessLogMapper;
//保存日志
    @Override
    public int saveSysLog(Map<String, Object> map) {
        return sysAccessLogMapper.saveSysLog(map);
    }
//分页查看日志信息
    @Override
    public Map<String, Object> querySysLogList(Map<String, Object> map) {
//        获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
//        获取当前行
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
//        分页查询
        PageHelper.startPage(pageNum,pageSize);
//        获取查询所有用户
        List<Map<String,Object>> resultList = sysAccessLogMapper.querySysLogList(map);
//        把所有信息放在pageinfo中
        PageInfo pageInfo = new PageInfo(resultList);
//        获取所有信息总行数
        long total = pageInfo.getTotal();
//        创建一个map数组
        Map<String,Object> resultMap = new HashMap<>();
//        把所有的信息放在map中
        resultMap.put("total",total);
        resultMap.put("rows",resultList);
        return resultMap;
    }
}
