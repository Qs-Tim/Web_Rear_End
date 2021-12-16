package main.com.qs.entity;

import java.sql.Date;

// 读者实体类
public class Reader {
    private int id;                 //数据库id
    private String readerId;        //读者id
    private String readerName;      //读者姓名
    private int sex;                //读者性别
    private Date registerTime;      //注册时间
    private int isDel;              //是否注销
    private Date modifyTime;        //修改时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
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

    @Override
    public String toString() {
        return "Reader{" +
                "readerId='" + readerId + '\'' +
                ", readerName='" + readerName + '\'' +
                ", sex=" + sex +
                ", registerTime=" + registerTime +
                ", isDel=" + isDel +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
