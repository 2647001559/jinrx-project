package com.jinrx.base.system.vo;

import com.jinrx.base.system.entity.SystemPermission;
import com.jinrx.base.system.entity.SystemUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
public class SystemUserDetails implements UserDetails {
    private SystemUser systemUser;
    private List<SystemPermission> permissionList;
    public SystemUserDetails(SystemUser systemUser, List<SystemPermission> permissionList) {
        this.systemUser = systemUser;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return permissionList.stream()
                .filter(permission -> permission.getSpValue()!=null)
                .map(permission ->new SimpleGrantedAuthority(permission.getSpValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return systemUser.getSuPassword();
    }

    @Override
    public String getUsername() {
        return systemUser.getSuAccount();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return systemUser.getStatus().equals(1);
    }
}
