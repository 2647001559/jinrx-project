package com.jinrx.base.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 用户收货地址表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_address")
public class UserAddress extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String uaId;

    private String uiId;

    private String uaPeople;

    private String uaPhone;

    private String uaProvince;

    private String uaCity;

    private String uaCounty;

    private String uaAddress;

    private String uaDefault;

    private Date creataTime;

    private Date updateTime;

    private String status;
}
