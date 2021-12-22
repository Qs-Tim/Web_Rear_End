package main.com.qs.dao;

import main.com.qs.entity.Id_Pass;
import main.com.qs.entity.Reader;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Mapper
@Repository
public interface ReaderMapper {
    //读者注册
    int register(Reader reader);

    //注册密码
    int registerPass(Id_Pass id_pass);

    //修改用户密码
    int updateReaderpass(int id, String password);

    //销毁用户账号
    int destroyAccount(int id);

    //查询单个读者信息
    Reader queryReaderMessageById(String readerId, String readerName, int id);

    //验证读者密码
    int judgePass(String readerId);

    //判断用户名是否重复
    int judgeIdRepeat(String readerId);

    //获取读者的数据库id
    int getIdInDB(String readerId);

    //判断当前读者是否被注销
    int getReaderIsDel(int id);

    //存入修改时间和修改人
    int updateTimeAndPerson(int id, int modifyId, Date date);

}
