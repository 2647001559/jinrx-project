package com.jinrx.base.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 后台用户登录日志表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_login_log")
public class SystemLoginLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String sllId;

    private String suId;

    private Date loginTime;

    private String sllIp;

    private String sllAddress;

    private String userAgent;
}
