package com.wyu.controller;

import com.wyu.common.AssembleResponseMsg;
import com.wyu.model.ResponseBody;
import com.wyu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

//    查询
//    @RequestBody Map<String,Object> map        前台传过来的参数
//   方法前的 ResponseBody  就是返回给前台的json数据，这个被我们重写封装过了
    @RequestMapping(value = "/queryUser",produces = "application/json;charset=utf-8")
    public ResponseBody queryUser(@RequestBody Map<String,Object> map){
        int flag = userService.queryUser(map);
        String name = "wyu";
        Map<String,String> all = new HashMap<>();
        if(flag==1){//说明存在账号和密码，即登录账号和密码输入正确
            for (Map.Entry<String,Object> entry:map.entrySet()){
                System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
                if(entry.getValue().equals(name)){
                    all.put("token","admin");
                    break;
                }else{
                    all.put("token","editor");
                }
            }
            all.put("status","OK");
            return new AssembleResponseMsg().success(all);
        }else{
            return new AssembleResponseMsg().failure(200,"error","用户名或密码错误");
        }


    }
//查找用户列表
    @RequestMapping(value = "/queryUserList",produces = "application/json;charset=utf-8")
    public ResponseBody queryUserList(@RequestBody Map<String,Object> map){
        Map<String,Object> resultmap = userService.queryUserList(map);
        return new AssembleResponseMsg().success(resultmap);
    }




//    新增
    @RequestMapping(value="/addUser",produces = "application/json;charset=utf-8")
    public ResponseBody addUser(@RequestBody Map<String,Object> map){
        userService.addUser(map);
        return new AssembleResponseMsg().success("OK");
    }


//    根据用户姓名更新数据
    @RequestMapping(value="/updateUserByName",produces = "application/json;charset=utf-8")
    public ResponseBody updateUserByName(@RequestBody Map<String,Object> map){
        userService.updateUserByName(map);
        return new AssembleResponseMsg().success("OK");
    }
    //    根据用户id更新数据
    @RequestMapping(value="/updateUserById",produces = "application/json;charset=utf-8")
    public ResponseBody updateUserById(@RequestBody Map<String,Object> map){
        userService.updateUserById(map);
        return new AssembleResponseMsg().success("OK");
    }


//    根据姓名删除数据
    @RequestMapping(value = "/delUser",produces = "application/json;charset=utf-8")
    public  ResponseBody delUser(@RequestBody Map<String,Object> map){

        userService.delUser(map);
        return  new AssembleResponseMsg().success("OK");
    }
//根据姓名修改密码
    @RequestMapping(value = "/queryUserPass",produces = "application/json;charset=utf-8")
    public ResponseBody queryUserPass(@RequestBody Map<String,Object> map){
        userService.queryUserPass(map);
    return new AssembleResponseMsg().success("OK");
    }

}
