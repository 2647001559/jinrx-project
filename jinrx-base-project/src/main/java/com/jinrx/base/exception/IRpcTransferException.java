package com.jinrx.base.exception;

/**
 * <p>
 * TODO 自定义RPC调用异常
 * </p>
 *
 * @author 添柴灬少年
 * @version 1.0
 * @date 2019/12/13 10:51
 **/
public class IRpcTransferException extends Exception {
    public IRpcTransferException(){
        super();
    }
    public IRpcTransferException(String message){
        super(message);
    }
}
