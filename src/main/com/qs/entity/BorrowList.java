package main.com.qs.entity;

import java.sql.Date;

//借阅实体类
public class BorrowList {
    private int readerId;
    private int bookId;
    private int count;
    private int isDel;
    private Date modifyTime;
    private Date createTime;
    private int modifyId;

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
