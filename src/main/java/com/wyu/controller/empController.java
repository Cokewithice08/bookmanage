package com.wyu.controller;

import com.wyu.common.AssembleResponseMsg;
import com.wyu.model.ResponseBody;
import com.wyu.service.IempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class empController {
//   自动装配serviceceng
    @Autowired
    private IempService empService;

//    添加员工
    @RequestMapping(value = "/addEmp", produces = "application/json;charset=utf-8")
    public ResponseBody addEmp(@RequestBody Map<String,Object> map){
        empService.addEmp(map);
        return new AssembleResponseMsg().success("OK");
    }
//    删除员工
    @RequestMapping(value = "/deleteEmp",produces = "application/json;charset=utf-8")
    public  ResponseBody deleteEmp(@RequestBody Map<String,Object> map){
        empService.deleteEmp(map);
        return new AssembleResponseMsg().success("OK");
    }
//    编辑员工信息
    @RequestMapping(value = "/editEmp",produces = "application/json;charset=utf-8")
    public ResponseBody editEmp(@RequestBody Map<String ,Object> map){
        empService.editEmp(map);
        return new AssembleResponseMsg().success("OK");
    }
//    修改员工密码
    @RequestMapping(value = "/editEmpPsd",produces = "application/json;charset=utf-8")
    public ResponseBody editEmpPsd(@RequestBody Map<String,Object> map){
        empService.editEmpPsd(map);
        return  new AssembleResponseMsg().success("OK");
    }
//    查询员工信息
    @RequestMapping(value = "/queryEmpByName", produces = "application/json;charset=utf-8")
    public ResponseBody queryEmpByName(@RequestBody Map<String,Object> map){
        Map<String,Object> newMap = empService.queryEmpByName(map);
        return new AssembleResponseMsg().success(newMap);
    }

//    查询员工信息列表
    @RequestMapping(value = "/queryEmpList",produces = "application/json;charset=utf-8")
    public ResponseBody queryEmpList(@RequestBody Map<String,Object> map){
       Map<String,Object> newMap= empService.queryEmpList(map);
        return new AssembleResponseMsg().success(newMap);
    }
}
