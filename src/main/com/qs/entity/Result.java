package main.com.qs.entity;

import java.util.List;

//返回类
public class Result {
    private Boolean result;        //返回结果（success or fail）
    private int code;              //返回码
    private String message;        //返回消息
    private List<Object> data;     //返回的data

    @Override
    public String toString() {
        return "Result{" +
                "result=" + result +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
