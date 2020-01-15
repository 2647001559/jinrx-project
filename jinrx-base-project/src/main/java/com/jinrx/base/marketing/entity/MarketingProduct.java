package com.jinrx.base.marketing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 营销产品表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("marketing_product")
public class MarketingProduct extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String mpId;

    private String mtId;

    private String piId;

    private String mtProductName;

    private String mtProductIcon;

    private Double mtPrice;

    private Integer mtMakeNumber;

    private Date createTime;

    private Date updateTime;

    private String status;
}
