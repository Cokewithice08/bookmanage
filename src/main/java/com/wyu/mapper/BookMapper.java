package com.wyu.mapper;

import com.wyu.model.Book;
import com.wyu.model.BookSub;

import java.util.List;
import java.util.Map;
//图书持久层借口
public interface BookMapper {
//    添加图书
    void addBook(Map<String,Object> map);
//    编辑图书
    void editBook(Map<String,Object> map);
//    删除图书
    void delBook(Map<String,Object> map);
//    查询图书列表
    List<Book> queryBookList(Map<String,Object> map);
//    借阅图书
    void addSubBook(Map<String,Object> map);
//    归还图书
    void returnSubBook(Map<String,Object> map);
//    查看借阅图书列表
    List<BookSub> querySub(Map<String,Object> map);
//    更新图书库存
    void updateInventtories(Map<String,Object> map);
}
