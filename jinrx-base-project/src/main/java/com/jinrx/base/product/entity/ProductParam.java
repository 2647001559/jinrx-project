package com.jinrx.base.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 产品参数表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("product_param")
public class ProductParam extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String ppId;

    private String ppBrand;

    private String ppModel;

    private String ppMaterial;

    private String ppWaterproof;

    @TableField("pp_EF")
    private String ppEf;

    private String ppProduce;

    private String ppTechnical;

    private String ppOpen;

    private Date createTime;

    private Date updateTime;

    private String status;
}
