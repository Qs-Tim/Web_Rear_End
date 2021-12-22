package main.com.qs.utils;

import main.com.qs.dao.BookBorrowMapper;
import main.com.qs.dao.BookMapper;
import main.com.qs.dao.ReaderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;


@Component
//MyBatis连接数据库工具类
public class DBTools {
    public static SqlSession getSqlSession() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        return sqlSessionFactory.openSession(true);
    }

    public ReaderMapper getBookMapper() throws IOException {
        return DBTools.getSqlSession().getMapper(ReaderMapper.class);
    }

    public BookBorrowMapper getBookBorrowMapper() throws IOException {
        return DBTools.getSqlSession().getMapper(BookBorrowMapper.class);
    }

    public BookMapper getReaderMapper() throws IOException {
        return DBTools.getSqlSession().getMapper(BookMapper.class);
    }

    public Boolean closeSession(SqlSession session){
        try {
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }
}
