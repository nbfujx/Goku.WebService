package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goku.handle.sysUserHandle;
import com.goku.model.sysUser;
import com.goku.service.sysUserService;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * Created by nbfujx on 2017/10/14.
 */
@Service
public class SysUserServiceImpl implements sysUserService {

    @Autowired
    private sysUserHandle sysuserhandle;


    @Override
    public sysUser selectByUsername(String username) {
        return sysuserhandle.selectByUsername(username);
    }

    @Override
    public sysUser selectByid(String id) {
        return sysuserhandle.selectByid(id);
    }

}
