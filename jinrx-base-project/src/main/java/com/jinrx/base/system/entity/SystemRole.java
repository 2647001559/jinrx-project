package com.jinrx.base.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 后台角色表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_role")
public class SystemRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String srId;

    private String srName;

    private String srDescription;

    private Integer srAdminCount;

    private Date createTime;

    private Integer status;

    private Integer sort;
}
