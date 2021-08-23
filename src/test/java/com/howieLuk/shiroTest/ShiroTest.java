package com.howieLuk.shiroTest;

import com.howieluk.services.TestRequireRoles;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @Author HowieLuk
 * @Date 2021/8/8 12:34
 **/
public class ShiroTest {

    @Test
    public void shiroTest() {
        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //2、得到SecurityManager实例 并绑定给SecurityUtils
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("howieLuk", "123");
        try {
            subject.login(token);

//            Session session = subject.getSession(); // 获取会话
//            session.getId(); // 会话标识
//            session.getHost(); // 获取主机地址
//            session.touch(); // 更新最后访问时间
//            session.stop(); // 销毁对话

//            subject.checkPermissions("");
//            TestRequireRoles testRequireRoles = new TestRequireRoles();
//            testRequireRoles.testRequireRoles();
        } catch (AuthenticationException e) {
            System.out.println("login fail");
        }
        Assert.assertTrue("登录失败！", subject.isAuthenticated());
    }
}
