package com.jinrx.base.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 产品价格表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("product_price")
public class ProductPrice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String pprId;

    private String piId;

    private Double pprPrice;

    private String pprImage;

    private String pprGroup;

    private Date createTime;

    private Date updateTime;

    private String status;
}
