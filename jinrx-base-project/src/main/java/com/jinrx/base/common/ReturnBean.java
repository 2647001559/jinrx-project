package com.jinrx.base.common;

import java.io.Serializable;

/**
 * <p>
 * TODO 返回分装类
 * </p>
 *
 * @author 添柴灬少年
 * @version 1.0
 * @date 2020/1/15 19:34
 **/
public class ReturnBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息码
     */
    private String status;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 响应数据
     */
    private T resData;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResData() {
        return resData;
    }

    public void setResData(T resData) {
        this.resData = resData;
    }

    /**
     * 设置状态码和返回码
     * @param statusCode
     */
    public void setStatusCode(StatusCode statusCode){
        this.status = statusCode.status();
        this.code = statusCode.code();
    }

    /**
     * 设置异常返回信息
     * @param excetion
     */
    public void setExcetion(Exception excetion){
        this.setStatusCode(StatusCode.EXCEPTION);
        this.msg = excetion.getMessage();
    }

    /**
     * 设置异常返回信息
     * @param excetion
     */
    public void setExcetion(Exception excetion,String message){
        this.setStatusCode(StatusCode.EXCEPTION);
        this.msg = message;
    }

    @Override
    public String toString() {
        return "ReturnBean{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", resData=" + resData +
                '}';
    }
}
