package com.wyu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.javafx.collections.MappingChange;
import com.wyu.mapper.PlacardMapper;
import com.wyu.model.Placard;
import com.wyu.service.IPlacardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//公告业务层实现
@Service
public class PlacardServiceImpl implements IPlacardService {

//    自动装配
    @Autowired
    private PlacardMapper placardMapper;

//添加公告
    @Override
    public void addPlacard(Map<String, Object> map) {
        placardMapper.addPlacard(map);
    }
//删除公告
    @Override
    public void deletePlacard(Map<String, Object> map) {
        placardMapper.deletePlacard(map);
    }
//编辑公告
    @Override
    public void editorPlacard(Map<String, Object> map) {
        placardMapper.editorPlacard(map);
    }
//查询公告
    @Override
    public Map<String, Object> queryPlacardList(Map<String, Object> map) {
//        获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
//        获取每页的数据
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
//        使用分页插件
        PageHelper.startPage(pageNum,pageSize);
//        查询结果保存在List里面
        List<Placard> placardList = placardMapper.queryPlacardList(map);
//        注册一个PageInfo
        PageInfo pageInfo = new PageInfo(placardList);
//        获取list有多少条信息
        long total = pageInfo.getTotal();
//        注册一个map
        Map<String,Object> returnMap = new HashMap<>();
//        把信息放在map中
        returnMap.put("total",total);
        returnMap.put("rows",placardList);

        return returnMap;
    }
}
