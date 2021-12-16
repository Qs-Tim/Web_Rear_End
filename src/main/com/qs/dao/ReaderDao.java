package main.com.qs.dao;

import main.com.qs.entity.Reader;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderDao {
    //读者注册
    int register();

    //注册密码
    int registerPass();

    //修改用户密码
    int updateReaderpass();

    //销毁用户账号
    int destroyAccount();

    //查询读者信息
    List<Reader> queryReadersById();

    //验证读者密码
    int judgePass();

    //判断用户名是否重复
    int judgeIdRepeat();

    //获取读者的数据库id
    int getIdInDB(String readerId);

    //判断当前读者是否被注销
    int getReaderIsDel(int id);

    //存入修改时间和修改人
    int updateTimeAndPerson(int id);

}
