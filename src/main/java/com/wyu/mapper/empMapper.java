package com.wyu.mapper;

import com.wyu.model.emp;

import java.util.List;
import java.util.Map;

//员工信息持久层
public interface empMapper {
    //    添加员工
    void addEmp(Map<String, Object> map);
//    删除员工信息
    void deleteEmp(Map<String,Object> map);
//    编辑员工信息
    void editEmp(Map<String,Object> map);
//    修改密码
    void editEmpPsd(Map<String,Object> map);
//    员工信息列表
    List<emp> queryEmpList(Map<String,Object> map);
//    根据员工姓名查找
    Map<String,Object> queryEmpByName(Map<String,Object> map);

}
