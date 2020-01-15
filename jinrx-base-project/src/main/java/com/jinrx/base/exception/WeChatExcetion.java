package com.jinrx.base.exception;

import lombok.Getter;

/**
 * <p>
 * TODO 异常类 -- 微信相关
 * </p>
 *
 * @author 添柴灬少年
 * @version 1.0
 * @date 2019/12/12 14:43
 **/
@Getter
public class WeChatExcetion extends RuntimeException {

    private String code;

    public WeChatExcetion(String code , String messgae){
        super(messgae);
        this.code = code;
    }
}
