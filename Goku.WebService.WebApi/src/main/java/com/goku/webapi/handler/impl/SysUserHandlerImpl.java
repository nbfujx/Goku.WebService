package com.goku.webapi.handler.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.goku.model.SysUser;
import com.goku.service.SysUserService;
import com.goku.webapi.handler.SysUserHandler;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by nbfujx on 2017/10/15.
 */
@Component
public class SysUserHandlerImpl implements SysUserHandler {

    @Reference(version = "1.0.0")
    SysUserService sysuserservice;

    @Override
    public List<SysUser> selectUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled)
    {
        return sysuserservice.selectUserByOrgid(orgid,pageNo,pageSize,orderSort,orderFiled);
    }

    @Override
    public SysUser selectByid(String id) {
        return sysuserservice.selectByid(id);
    }
}
