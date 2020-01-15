package com.jinrx.base.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jinrx.base.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台角色权限表
 * </p>
 *
 * @author 添柴灬少年
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_role_relation")
public class SystemRoleRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String srrId;

    private String srId;

    private String spId;
}
