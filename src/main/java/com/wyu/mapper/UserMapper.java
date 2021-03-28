package com.wyu.mapper;
//用户持久层

import com.wyu.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

//    查找
    int queryUser(Map<String,Object> map);
//    查找用户列表
    List<User> queryUserList(Map<String,Object> map);
//    新增
    void addUser(Map<String,Object> map);
//    根据用户姓名更新数据
    void updateUserByName(Map<String,Object> map);

//    根据用户id更新数据
    void updateUserById(Map<String,Object> map);

//    删除（根据姓名）
    void delUser(Map<String,Object> map);
//根据姓名修改密码
    void queryUserPass(Map<String,Object> map);

}
