package main.com.qs.entity;

import java.sql.Date;

// id_pass实体类
public class Id_Pass {
    private String readerId;        //读者id
    private String readerPass;      //读者登录密码
    private Date modifyTime;        //修改时间
    private Date creteTime;         //创建时间

    @Override
    public String toString() {
        return "Id_Pass{" +
                "readerId='" + readerId + '\'' +
                ", readerPass='" + readerPass + '\'' +
                ", modifyTime=" + modifyTime +
                ", creteTime=" + creteTime +
                '}';
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getReaderPass() {
        return readerPass;
    }

    public void setReaderPass(String readerPass) {
        this.readerPass = readerPass;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }
}
