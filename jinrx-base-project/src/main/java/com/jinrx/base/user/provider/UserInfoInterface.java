package com.jinrx.base.user.provider;

import com.jinrx.base.common.ReturnBean;
import com.jinrx.base.user.entity.UserInfo;

/**
 * @author 添柴灬少年
 * @date 2019/12/10 - 17:08
 * TODO 用户服务提供API
 */
public interface UserInfoInterface {
    /**
     * 获取单个用户信息
     * @param userInfo
     * @return
     */
    ReturnBean<UserInfo> get(UserInfo userInfo);
}
