package com.jinrx.base.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 系统参数表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_param")
public class SystemParam extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String spId;

    private String spLable;

    private String spValue;

    private String spExplain;

    private String spParentId;

    private Date createTime;

    private Date updateTime;

    private String status;
}
