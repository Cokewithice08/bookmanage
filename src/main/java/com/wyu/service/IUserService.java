package com.wyu.service;
import java.util.Map;

public interface IUserService {
//    用户业务层接口
//    查询用户
    int queryUser(Map<String,Object> map);
//    查询用户列表
    Map<String,Object> queryUserList(Map<String,Object> map);
//    新增用户
    void addUser(Map<String,Object> map);
//    根据用户姓名更新数据
    void updateUserByName(Map<String,Object> map);
//    根据用户id更新数据
    void updateUserById(Map<String,Object> map);
//    根据姓名删除数据
    void delUser(Map<String,Object> map);
//    根据姓名修改密码
    void queryUserPass(Map<String,Object> map);
}
