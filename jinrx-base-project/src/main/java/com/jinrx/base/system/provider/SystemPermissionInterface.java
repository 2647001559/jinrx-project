package com.jinrx.base.system.provider;

import com.jinrx.base.common.ReturnBean;
import com.jinrx.base.system.entity.SystemPermission;

import java.util.List;

/**
 * @author 添柴灬少年
 * @date 2019/12/27 - 17:22
 * TODO 系统权限服务登陆接口
 */
public interface SystemPermissionInterface {
    /**
     * 加载权限
     * @param systemUserId
     * @return
     */
    ReturnBean<List<SystemPermission>> loadSystemPermissions(String systemUserId);
}
