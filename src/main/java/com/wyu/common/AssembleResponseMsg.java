package com.wyu.common;


import com.wyu.model.InfoMsg;
import com.wyu.model.ResponseBody;


public class AssembleResponseMsg {
//    封装Responsebody内容

//    success
    public <T> ResponseBody success(T data){
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setData(data);
        InfoMsg info = new InfoMsg();
        resp.setInfo(info);
        return resp;

    }


//    failure
    public <T>ResponseBody failure(int status,String errorCode,String message){
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setStatus(status);
        InfoMsg info = new InfoMsg();
        info.setCode(errorCode);
        info.setMessage(message);
        resp.setInfo(info);

        return resp;
    }

}
