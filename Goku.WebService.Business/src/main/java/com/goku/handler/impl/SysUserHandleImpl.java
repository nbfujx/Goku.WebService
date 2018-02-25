package com.goku.handler.impl;


import com.goku.handler.SysUserHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.goku.mapper.ext.SysUserExtMapper;
import com.goku.model.SysUser;

import java.util.List;


/**
 * Created by nbfujx on 2017/10/14.
 */
@Component
public class SysUserHandleImpl implements SysUserHandle {

    @Autowired
    private SysUserExtMapper sysuserextmapper;

    @Override
    public SysUser selectByUsername(String username) {
        return sysuserextmapper.selectByUsername(username);
    }

    @Override
    public SysUser selectByid(String id) {
        return sysuserextmapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysUser> selectUserByOrgid(String orgid, String orderSort, String orderFiled) {
        return sysuserextmapper.selectUserByOrgid(orgid,orderSort,orderFiled);
    }


}
