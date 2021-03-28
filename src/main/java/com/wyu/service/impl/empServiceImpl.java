package com.wyu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyu.mapper.empMapper;
import com.wyu.model.emp;
import com.wyu.service.IempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class empServiceImpl implements IempService {
//    自动转配员工属性
    @Autowired
    private empMapper empMapper;

//    添加员工
    @Override
    public void addEmp(Map<String, Object> map) {
        empMapper.addEmp(map);
    }
//删除员工
    @Override
    public void deleteEmp(Map<String, Object> map) {
        empMapper.deleteEmp(map);
    }
//编辑员工信息
    @Override
    public void editEmp(Map<String, Object> map) {
        empMapper.editEmp(map);
    }
//修改密码
    @Override
    public void editEmpPsd(Map<String, Object> map) {
        empMapper.editEmpPsd(map);
    }
//查询员工信息列表
    @Override
    public Map<String,Object> queryEmpList(Map<String, Object> map) {
//        获取页码
        int pageNum =Integer.parseInt(map.get("pageNum").toString());
//        获取每页有多少条数据
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
//        分页查询
        PageHelper.startPage(pageNum,pageSize);
//      查询员工列表
        List<emp> returnMap = empMapper.queryEmpList(map);
//        把列表放入pageinfo中
        PageInfo pageInfo = new PageInfo(returnMap);
//        获取总共有多少条数据
        long total = pageInfo.getTotal();
//      初始化一个map用来存储获取的数据
        Map<String,Object> empMap= new HashMap<>();
        empMap.put("total",total);
        empMap.put("rows",returnMap);
        return empMap;
    }
//通过信息查询员工信息
    @Override
    public Map<String, Object> queryEmpByName(Map<String, Object> map) {
        return empMapper.queryEmpByName(map);
    }
}
