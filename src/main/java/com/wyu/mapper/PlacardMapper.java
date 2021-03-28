package com.wyu.mapper;

import com.wyu.model.Placard;

import java.util.List;
import java.util.Map;

//公告持久层
public interface PlacardMapper {
//    添加公告
    void addPlacard(Map<String,Object> map);
//    删除公告
    void deletePlacard(Map<String,Object> map);
//    编辑公告
    void editorPlacard(Map<String,Object> map);
//    查询公告列表
    List<Placard> queryPlacardList(Map<String,Object> map);
//查询公告

}
