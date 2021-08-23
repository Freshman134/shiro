package com.howieluk.services;

import org.apache.shiro.authz.annotation.RequiresRoles;

/**
 * @Deacription TODO
 * @Author HowieLuk
 * @Date 2021/8/14 2:15
 * @Version 1.0
 **/
public class TestRequireRoles {

    @RequiresRoles("admin")
    public void testRequireRoles() {
        System.out.println("admin");
    }
}
