package com.wyu.controller;
//系统访问日志

import com.wyu.common.AssembleResponseMsg;
import com.wyu.model.ResponseBody;
import com.wyu.service.ISysAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SysAccessLogController {
    @Autowired
    private ISysAccessLogService sysAccessLogService;




//    查询系统访问日志列表
    @RequestMapping(value = "/querySysLogList",produces = "application/json;charset=utf-8")
    public ResponseBody querySysLogList(@RequestBody Map<String,Object> map){
        Map<String,Object> resultMap = sysAccessLogService.querySysLogList(map);
        return  new AssembleResponseMsg().success(resultMap);

    }
}
