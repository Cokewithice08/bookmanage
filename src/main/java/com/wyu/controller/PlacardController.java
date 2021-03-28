package com.wyu.controller;

import com.wyu.common.AssembleResponseMsg;
import com.wyu.model.ResponseBody;
import com.wyu.service.IPlacardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//表示层
@RestController
public class PlacardController {
//    自动装配service层
    @Autowired
    private IPlacardService iPlacardService;
//    添加公告
    @RequestMapping(value="/addPlacard", produces="application/json;charset=utf-8")
    public ResponseBody addPlacard(@RequestBody Map<String,Object> map){
        try{
            iPlacardService.addPlacard(map);
            return new AssembleResponseMsg().success("OK");
        }catch(Exception e)
        {
            return new AssembleResponseMsg().failure(200,"error","添加失败");
        }

    }
//    删除公告
    @RequestMapping(value = "/deletePlacard",produces = "application/json;charset=utf-8")
    public ResponseBody deletePlacard(@RequestBody Map<String,Object> map){
        try {
            iPlacardService.deletePlacard(map);
            return new AssembleResponseMsg().success("OK");
        }catch (Exception e)
        {
            return  new AssembleResponseMsg().failure(200,"error","删除失败");
        }
    }
//    编辑公告
    @RequestMapping(value = "/editorPlacard",produces = "application/json;charset=utf-8")
    public ResponseBody editorPlacard(@RequestBody Map<String,Object> map){
        try {
            iPlacardService.editorPlacard(map);
            return new AssembleResponseMsg().success("OK");
        }catch (Exception e){
            return new AssembleResponseMsg().failure(200,"error","编辑失败");

        }

    }
//    查询公告
    @RequestMapping(value = "/queryPlacardList",produces = "application/json;charset=utf-8")
    public ResponseBody queryPlacardList(@RequestBody Map<String,Object> map){
            Map<String,Object> returnMap = iPlacardService.queryPlacardList(map);
            return new AssembleResponseMsg().success(returnMap);

    }
}
