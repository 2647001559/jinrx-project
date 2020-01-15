package com.jinrx.base.exception;

/**
 * <p>
 * TODO 自定义服务层异常
 * </p>
 *
 * @author 添柴灬少年
 * @version 1.0
 * @date 2019/12/26 18:06
 **/
public class IServiceException extends Exception {
    public IServiceException(){
        super();
    }
    public IServiceException(String message){
        super(message);
    }
}
