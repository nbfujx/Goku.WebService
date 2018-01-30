package com.goku.handler.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.goku.handler.sysUserHandle;
import com.goku.mapper.ext.sysUserExtMapper;
import com.goku.mapper.sysUserMapper;
import com.goku.model.sysUser;

import java.util.List;
import java.util.Map;


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

    @Override
    public List<sysUser> selectUserByOrgid(String orgid,String orderSort,String orderFiled) {
        return sysuserextmapper.selectUserByOrgid(orgid,orderSort,orderFiled);
    }


}
