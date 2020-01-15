package com.jinrx.base.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 用户账单表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_bill")
public class UserBill extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String ubId;

    private String uiId;

    private Date ubExchangeHour;

    private String ubExchangeMode;

    private Double ubExchangeAmount;

    private String ubStatus;

    private String ubOrderNo;

    private String oiId;

    private String status;

    private Date createTime;
}
