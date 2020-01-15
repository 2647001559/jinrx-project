package com.jinrx.base.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 订单产品表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("order_product")
public class OrderProduct extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String opId;

    private String oiId;

    private String piId;

    private String pprId;

    private String opProductName;

    private String opConfigureName;

    private String opProductIcon;

    private Integer opNumber;

    private Double opTotalAmount;

    private Double opCoupontAmount;

    private Double opAmount;

    private Date createTime;

    private Date updateTime;

    private String status;
}
