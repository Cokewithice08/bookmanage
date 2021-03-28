package com.wyu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyu.mapper.UserMapper;
import com.wyu.model.User;
import com.wyu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//记得加@service才能找到
@Service
public class UserServiceImpl implements IUserService {

//    用户业务层实现类
    @Autowired
    private UserMapper userMapper;
//根据条件查询用户
    @Override
    public int queryUser(Map<String, Object> map) {
        return userMapper.queryUser(map);
    }
//    查询用户列表

    @Override
    public Map<String, Object> queryUserList(Map<String, Object> map) {
//        获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
//        每页有多少行
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
//        分页查询
        PageHelper.startPage(pageNum,pageSize);
//        查询所有的用户
        List<User> userList = userMapper.queryUserList(map);
//        所有用户信息放在pageInfo中
        PageInfo pageInfo = new PageInfo(userList);
//        获取总行数（多少条数据）
        long total = pageInfo.getTotal();
        Map<String,Object> resultmap = new HashMap<>();
        resultmap.put("total",total);
        resultmap.put("rows",userList);
        return resultmap;
    }

    //新增用户
    @Override
    public void addUser(Map<String, Object> map) {
        userMapper.addUser(map);
    }
//根据用户姓名更新数据
    @Override
    public void updateUserByName(Map<String, Object> map) {
        userMapper.updateUserByName(map);
    }
//根据用户id更新数据
    @Override
    public void updateUserById(Map<String, Object> map) {
        userMapper.updateUserById(map);
    }
//根据姓名删除数据
    @Override
    public void delUser(Map<String, Object> map) {
        userMapper.delUser(map);
    }
//根据姓名修改密码
    @Override
    public void queryUserPass(Map<String, Object> map) {
        userMapper.queryUserPass(map);
    }


}
