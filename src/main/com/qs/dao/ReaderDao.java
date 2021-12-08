package main.com.qs.dao;

import main.com.qs.entity.Reader;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderDao {
    int register();
    int registerPass();
    int updateReaderpass();
    int destroyAccount();
    List<Reader> queryReadersById();
    int judgePass();
    int judgeIdRepeat();
}
