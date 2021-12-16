package main.com.qs.entity;

import org.springframework.stereotype.Repository;

import java.sql.Date;

//借阅实体类
@Repository
public class BorrowList {
    private int id;                 //数据库id
    private int readerId;           //借阅者id
    private int bookId;             //借阅书籍id
    private int count;              //借阅数量
    private int isDel;              //书籍是否归还完成
    private Date modifyTime;        //归还时间
    private Date createTime;        //借阅时间
    private int modifyId;           //修改人id

    @Override
    public String toString() {
        return "BorrowList{" +
                "readerId=" + readerId +
                ", bookId=" + bookId +
                ", count=" + count +
                ", isDel=" + isDel +
                ", modifyTime=" + modifyTime +
                ", createTime=" + createTime +
                ", modifyId=" + modifyId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getModifyId() {
        return modifyId;
    }

    public void setModifyId(int modifyId) {
        this.modifyId = modifyId;
    }
}
