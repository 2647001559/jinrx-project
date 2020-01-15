package com.jinrx.base.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 后台用户表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_user")
public class SystemUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String suId;

    private String suAccount;

    private String suPassword;

    private String suNickName;

    private String suHeadIcon;

    private String suEmail;

    private String suNote;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private Date loginTime;

    private String status;
}
