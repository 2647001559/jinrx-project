package com.jinrx.base.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 后台权限表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_permission")
public class SystemPermission extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String spId;

    private String spParentId;

    private String spName;

    private String spValue;

    private String spIcon;

    private Integer spType;

    private String spUrl;

    private Integer status;

    private Date createTime;

    private Integer spSort;
}
