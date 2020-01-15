package com.jinrx.base.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 订单物流表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("order_logistics")
public class OrderLogistics extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String olId;

    private String oiId;

    private String oiNo;

    private String uaId;

    private String olShipperCode;

    private String olLogisticCode;

    private Date createTime;

    private Date updateTime;

    private String status;
}
