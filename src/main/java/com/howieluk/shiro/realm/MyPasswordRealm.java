package com.howieluk.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 可用于验证、授权的realm，
 * @author HowieLuk
 * @date 2021/8/24 9:53
 */
public class MyPasswordRealm extends AuthorizingRealm {

    /**
     * 重写支持的token
     * @param token
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return super.supports(token);
    }

    /**
     * 获取授权相关info
     * @param principalCollection
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 获取验证相关info
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
