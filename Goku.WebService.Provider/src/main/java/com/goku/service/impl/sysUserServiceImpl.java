package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.SysUserHandle;
import com.goku.model.SysUser;
import com.goku.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by nbfujx on 2017/10/14.
 */
@Service(version = "1.0.0")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserHandle sysuserhandle;

    @Override
    public SysUser selectByid(String id) {
        return sysuserhandle.selectByid(id);
    }

    @Override
    public SysUser selectByUsername(String username) {
        return sysuserhandle.selectByUsername(username);
    }

    @Override
    public List<SysUser> selectUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled) {
        PageHelper.startPage(pageNo, pageSize);
        List<SysUser> userall= sysuserhandle.selectUserByOrgid(orgid,orderSort,orderFiled);
        PageInfo<SysUser> pageInfo =new PageInfo(userall);
        List<SysUser> users=pageInfo.getList();
        return users;
    }


}
