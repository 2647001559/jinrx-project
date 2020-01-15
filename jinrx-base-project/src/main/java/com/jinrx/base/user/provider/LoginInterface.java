package com.jinrx.base.user.provider;

import com.jinrx.base.common.ReturnBean;
import com.jinrx.base.user.entity.UserInfo;

/**
 * <p>
 *     TODO 用户登陆服务API
 * </p>
 * @author 添柴灬少年
 * @date 2019/12/13 - 10:26
 */
public interface LoginInterface {

    /**
     * 微信用户登陆
     * @param openId
     * @return
     */
    ReturnBean<UserInfo> login(String openId) throws Exception;

    /**
     * 注册用户信息
     * 微信用户授权成功，如果是新用户则默认调用此接口，保存用户信息
     * openId必填项
     * @param userInfo
     * @return
     */
    ReturnBean<Boolean> register(UserInfo userInfo) throws Exception;

    /**
     * 用户认证
     * 用户id、手机号为必填项
     * @param userInfo
     * @return
     */
    ReturnBean<Boolean> certification(UserInfo userInfo) throws Exception;
}
