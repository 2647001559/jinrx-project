package com.jinrx.base.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 产品分类表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("product_classification")
public class ProductClassification extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String pcId;

    private String pcName;

    private String pcIcon;

    private String pcLevel;

    private String pcParentId;

    private Date createTime;

    private Date updateTime;

    private String status;
}
