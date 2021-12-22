package main.com.qs.service.impl;

import main.com.qs.dao.ReaderMapper;
import main.com.qs.entity.Id_Pass;
import main.com.qs.entity.Reader;
import main.com.qs.service.ReaderService;
import main.com.qs.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.sql.Date;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Override
    @Transactional
    public int registerReader(Reader reader, Id_Pass id_pass) {
        SqlSession session = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            if(readerMapper.judgeIdRepeat(reader.getReaderId()) == 0){
                //注册用户
                readerMapper.register(reader);
                //注册用户密码
                readerMapper.registerPass(id_pass);

                return 1;
            }

            else {
                return 2;   //账号已存在，返回2
            }
        } catch (IOException e) {
            e.printStackTrace();

            return 0;
        } finally {

            assert session != null;
            session.close();

        }
    }

    @Override
    @Transactional
    public int updateReaderpass(int id, String password) {
        SqlSession session = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            readerMapper.updateReaderpass(id, password);

            return 1;
        } catch (IOException e) {
            e.printStackTrace();

            return 0;
        } finally {

            assert session != null;
            session.close();

        }
    }

    @Override
    @Transactional
    public int destroyAccount(int id) {
        SqlSession session = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            readerMapper.destroyAccount(id);

            return 1;
        } catch (IOException e) {
            e.printStackTrace();

            return 0;
        } finally {

            assert session != null;
            session.close();

        }
    }

    @Override
    @Transactional
    public Reader queryReaderMessageById(String readerId, String readerName, int id) {
        SqlSession session = null;
        Reader reader = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            reader = readerMapper.queryReaderMessageById(readerId, readerName, id);

            return reader;
        } catch (IOException e) {
            e.printStackTrace();

            return reader;
        } finally {

            assert session != null;
            session.close();

        }
    }

    @Override
    public int judgePass(String readerId) {
        SqlSession session = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            return readerMapper.judgePass(readerId);
        } catch (IOException e) {
            e.printStackTrace();

            return 0;
        } finally {

            assert session != null;
            session.close();

        }
    }

    @Override
    public int getIdInDB(String readerId) {
        SqlSession session = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            return readerMapper.getIdInDB(readerId);
        } catch (IOException e) {
            e.printStackTrace();

            return 0;
        } finally {

            assert session != null;
            session.close();

        }
    }

    @Override
    public int getReaderIsDel(int id) {
        SqlSession session = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            return readerMapper.getReaderIsDel(id);
        } catch (IOException e) {
            e.printStackTrace();

            return -1;
        } finally {

            assert session != null;
            session.close();

        }
    }

    @Override
    public int updateTimeAndPerson(int id, int modifyId) {
        SqlSession session = null;

        try {
            session = DBTools.getSqlSession();
            ReaderMapper readerMapper = session.getMapper(ReaderMapper.class);

            return readerMapper.updateTimeAndPerson(id, modifyId, new Date(new java.util.Date().getTime()));
        } catch (IOException e) {
            e.printStackTrace();

            return 0;
        } finally {

            assert session != null;
            session.close();

        }
    }
}
