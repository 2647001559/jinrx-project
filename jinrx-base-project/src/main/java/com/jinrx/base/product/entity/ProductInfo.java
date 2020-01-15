package com.jinrx.base.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 产品信息表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("product_info")
public class ProductInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String piId;

    private String pcId;

    private String piName;

    private String piIcon;

    private String ppId;

    private Double piPrice;

    private String piUnit;

    private String piRotation;

    private String piDetail;

    private String status;
}
