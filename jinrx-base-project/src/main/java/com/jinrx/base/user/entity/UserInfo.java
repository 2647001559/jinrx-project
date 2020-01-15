package com.jinrx.base.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_info")
public class UserInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String uiId;

    private String uiName;

    private String uiHead;

    private String uiAddress;

    private String uiPhone;

    private String uiOpenId;

    private Date createTime;

    private Date updateTime;

    private String status;
}
