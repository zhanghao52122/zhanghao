package com.ymlh.admin.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by zhanghao on 2019/5/1.
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

}
