package com.jinrx.base.product.entity;

import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 购物车表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ShoppingCart extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String oscId;

    private String uiId;

    private String piId;

    private String pprId;

    private String oscProductName;

    private String oscConfigureName;

    private String oscProductIcon;

    private Integer oscNumber;

    private Double oscAmount;

    private String status;

    private Date createTime;

    private Date updateTime;
}
