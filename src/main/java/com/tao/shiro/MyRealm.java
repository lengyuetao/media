package com.tao.shiro;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by zhangantao on 2017/4/21.
 */
public class MyRealm implements Realm {
    Logger log=Logger.getLogger(MyRealm.class);

    public String getName() {
        return null;
    }

    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username= (String) token.getPrincipal();
        String password=new String((char[])token.getCredentials());
        if(!"zat".equals(username)){
            log.error("用户名错误！");
            throw new UnknownAccountException();
        }
        if (!"123".equals(password)){
            log.error("密码错误！");
            throw new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
