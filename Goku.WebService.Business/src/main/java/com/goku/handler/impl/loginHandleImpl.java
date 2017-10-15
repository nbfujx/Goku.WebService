package com.goku.handler.impl;

import com.goku.handler.loginHandle;
import com.goku.mapper.ext.sysUserExtMapper;
import com.goku.model.sysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2017/10/14.
 */
@Component
public class loginHandleImpl  implements loginHandle {

    @Autowired
    private sysUserExtMapper sysuserextmapper;

    @Override
    public boolean validUser(String username, String password, String orgid) {
        sysUser sysUser=sysuserextmapper.validUser(username,password,orgid);
        if(sysUser==null)
        {
            return  false;
        }else
        {
            return true;
        }
    }

}
