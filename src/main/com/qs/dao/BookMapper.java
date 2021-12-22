package main.com.qs.dao;

import main.com.qs.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookMapper {
    //添加书籍
    int addBook(Book book);

    //根据ISBN获取书籍的数据库id
    int getBookId(String ISBN);

    //对数据库中书籍数目做减小操作
    int bookOut(int id, int count);

    //对数据库中书籍做增加操作
    int bookIn(int id, int count);

    //判断当前书籍是否可用
    int getBookIsDel(int id);

    //存入修改时间和修改人
    int updateTimeAndPerson(int id);

}
