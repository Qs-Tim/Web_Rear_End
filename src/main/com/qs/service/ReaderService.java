package main.com.qs.service;

import main.com.qs.entity.Id_Pass;
import main.com.qs.entity.Reader;

import java.io.IOException;

public interface ReaderService {
    //注册读者
    int registerReader(Reader reader, Id_Pass id_pass);

    //修改用户密码
    int updateReaderpass(int id, String password);

    //销毁用户账号
    int destroyAccount(int id);

    //查询单个读者信息
    Reader queryReaderMessageById(String readerId, String readerName, int id);

    //判断用户密码
    int judgePass(String readerId);

    //获取读者的数据库id
    int getIdInDB(String readerId);

    //判断当前读者是否被注销
    int getReaderIsDel(int id);

    //存入修改时间和修改人
    int updateTimeAndPerson(int id, int modifyId);

}
