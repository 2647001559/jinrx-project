package com.jinrx.base.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 用户优惠券表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_coupon")
public class UserCoupon extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String ucpId;

    private String uiId;

    private String ucpName;

    private Double ucpAmount;

    private Double ucpPayAmount;

    private String ucpType;

    private String ucpPayType;

    private String ucpPlace;

    private Date ucpExpiresTime;

    private String status;

    private Date createTime;

    private Date updateTime;
}
