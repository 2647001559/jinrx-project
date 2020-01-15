package com.jinrx.base.marketing.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 轮播图/宣传图
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("marketing_pentagon")
public class MarketingPentagon extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String mptId;

    private String mptImgPath;

    private String mptLocation;

    private String mptType;

    private Date createTime;

    private Date updateTime;

    private String status;
}
