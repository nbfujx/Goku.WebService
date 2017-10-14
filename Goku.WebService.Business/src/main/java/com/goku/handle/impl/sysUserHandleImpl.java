package com.goku.handle.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.goku.handle.sysUserHandle;
import com.goku.mapper.ext.sysUserExtMapper;
import com.goku.mapper.sysUserMapper;
import com.goku.model.sysUser;



/**
 * Created by nbfujx on 2017/10/14.
 */
@Component
public class sysUserHandleImpl implements sysUserHandle {

    @Autowired
    private sysUserMapper sysusermapper;

    @Autowired
    private sysUserExtMapper sysuserextmapper;

    @Override
    public sysUser selectByUsername(String username) {
        return sysuserextmapper.selectByUsername(username);
    }

    @Override
    public sysUser selectByid(String id) {
        return sysusermapper.selectByPrimaryKey(id);
    }

}
