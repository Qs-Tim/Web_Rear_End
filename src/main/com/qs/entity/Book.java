package main.com.qs.entity;

import java.sql.Date;

// 书籍实体类
public class Book {
    private int id;                 //数据库id
    private String ISBN;            //ISBN编码
    private String bookName;        //书名
    private String introduction;    //书籍介绍
    private int totalCount;         //书籍总库存数
    private Date intime;            //书籍入库时间
    private int price;              //书籍价格
    private int createId;           //入库者id
    private int isDel;              //书籍是否被移除（1：已被移除； 0：未被移除）
    private int modifyId;           //修改者id
    private Date modifyTime;        //修改时间
    private int currentCount;       //书籍当前库存

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCreateId() {
        return createId;
    }

    public void setCreateId(int createId) {
        this.createId = createId;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public int getModifyId() {
        return modifyId;
    }

    public void setModifyId(int modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", bookName='" + bookName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", totalCount=" + totalCount +
                ", intime=" + intime +
                ", price=" + price +
                ", createId=" + createId +
                ", isDel=" + isDel +
                ", modifyId=" + modifyId +
                ", modifyTime=" + modifyTime +
                ", currentCount=" + currentCount +
                '}';
    }
}
