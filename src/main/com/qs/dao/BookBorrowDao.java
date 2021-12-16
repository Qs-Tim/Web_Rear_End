package main.com.qs.dao;

import main.com.qs.entity.BorrowList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookBorrowDao {
    //借阅书籍
    int id_bookIn(int id, int count);

    //归还书籍
    int id_bookOut(int id, int count);

    //获取借阅历史
    List<BorrowList> getBorrowHistory(int id);

    //判断当前书籍是否已经归还成功
    int isBookReturned(int id);

    //存入修改时间和修改人
    int updateTimeAndPerson(int id);
}
