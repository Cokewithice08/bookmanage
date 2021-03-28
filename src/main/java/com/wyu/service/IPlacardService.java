package com.wyu.service;

import java.util.Map;

//业务接口
public interface IPlacardService {
//    添加公告
    void addPlacard(Map<String,Object> map);
//    删除公告
    void deletePlacard(Map<String,Object> map);
//    编辑公告
    void editorPlacard(Map<String,Object> map);
//    查询公告
    Map<String,Object> queryPlacardList(Map<String,Object> map);
}
