package com.jinrx.base.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台用户权限表(除角色中定义的权限以外的加减权限)
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_user_relation")
public class SystemUserRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String surId;

    private String suId;

    private String spId;

    private Integer type;
}
