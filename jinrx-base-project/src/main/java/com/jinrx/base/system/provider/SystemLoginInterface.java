package com.jinrx.base.system.provider;

import com.jinrx.base.common.ReturnBean;
import com.jinrx.base.system.entity.SystemUser;

/**
 * @author 添柴灬少年
 * @date 2019/12/25 - 15:35
 * TODO 系统服务登陆接口
 */
public interface SystemLoginInterface{

    /**
     * 注册
     * @param systemUser
     * @return
     */
    ReturnBean<SystemUser> register(SystemUser systemUser);

    /**
     * 根据账号获取用户信息
     * @param account
     * @return
     */
    ReturnBean<SystemUser> getSystemUserByAccount(String account);

    /**
     * 修改指定用户信息
     * @param systemUser
     * @return
     */
    ReturnBean<Boolean> update(SystemUser systemUser);

    /**
     * 删除指定用户信息
     * @param systemUser
     * @return
     */
    ReturnBean<Boolean> remove(SystemUser systemUser);
}
