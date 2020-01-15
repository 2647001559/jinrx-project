package com.jinrx.base.marketing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 优惠券表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("marketing_coupon")
public class MarketingCoupon extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String mcId;

    private String mcName;

    private Double mcAmount;

    private Double mcPayAmount;

    private String mcType;

    private String mcPayType;

    private String mcPlace;

    private Date mcExpiresTime;

    private Integer mcNumber;

    private Integer mcLeftoverNumber;

    private String status;

    private Date createTime;

    private Date updateTime;
}
