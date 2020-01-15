package com.jinrx.base.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 订单信息表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("order_info")
public class OrderInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String oiId;

    private String oiNo;

    private String uiId;

    private String uaId;

    private Double oiTotalAmount;

    private Double oiCoupontAmount;

    private Double oiAmount;

    private Date oiExchangeHour;

    private String oiExchangeMode;

    private String oiExchangeStatus;

    private String oiStatus;

    private Date createTime;

    private Date updateTime;

    private String status;
}
