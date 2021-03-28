package com.wyu.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyu.mapper.BookMapper;
import com.wyu.model.Book;
import com.wyu.model.BookSub;
import com.wyu.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements IBookService {
    //    图书业务层实现类
    @Autowired
    private BookMapper bookMapper;

//    添加图书
    @Override
    public void addBook(Map<String, Object> map) {
        bookMapper.addBook(map);
    }
//   编辑图书
    @Override
    public void editBook(Map<String, Object> map) {
        bookMapper.editBook(map);
    }
//    删除图书

    @Override
    public void delBook(Map<String, Object> map) {
        bookMapper.delBook(map);
    }
//  更新图书库存

    @Override
    public void updateInventtories(Map<String, Object> map) {
        bookMapper.updateInventtories(map);
    }


//    查询图书列表

    @Override
    public Map<String, Object> queryBookList(Map<String, Object> map) {
//        获取当前页
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
//        获取每页几条数据
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum,pageSize);
        List<Book> bookList = bookMapper.queryBookList(map);
        PageInfo pageInfo = new PageInfo(bookList);
//        获取list中有多少条数据
        long total = pageInfo.getTotal();
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("total",total);
        resultMap.put("rows",bookList);
        return resultMap;
    }

//    借阅图书
    @Override
    public void addSubBook(Map<String, Object> map) {
        bookMapper.addSubBook(map);
    }

//    归还图书

    @Override
    public void returnSubBook(Map<String, Object> map) {
        bookMapper.returnSubBook(map);
    }
//查看借阅图书列表
    @Override
    public Map<String, Object> querySub(Map<String, Object> map) {
//        //        获取当前页
//        int pageNum = Integer.parseInt(map.get("pageNum").toString());
////        获取每页的数据
//        int pageSize = Integer.parseInt(map.get("pageSize").toString());
////        使用分页插件
//        PageHelper.startPage(pageNum,pageSize);
        List<BookSub> bookList = bookMapper.querySub(map);
//        PageInfo pageInfo = new PageInfo(bookList);
//        long total = pageInfo.getTotal();
        Map<String,Object> resultMap = new HashMap<>();
//        resultMap.put("total",total);
        resultMap.put("rows",bookList);
        return resultMap;
    }
}
