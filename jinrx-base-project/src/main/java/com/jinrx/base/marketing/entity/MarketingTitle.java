package com.jinrx.base.marketing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 营销标题表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("marketing_title")
public class MarketingTitle extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String mtId;

    private String mtName;

    private String mtLevel;

    private String mtParentId;

    private Date createTime;

    private Date updateTime;

    private String status;
}
