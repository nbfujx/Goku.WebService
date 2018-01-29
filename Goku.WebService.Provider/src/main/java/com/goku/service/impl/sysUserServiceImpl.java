package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.sysUserHandle;
import com.goku.model.sysUser;
import com.goku.service.sysUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


/**
 * Created by nbfujx on 2017/10/14.
 */
@Service(version = "1.0.0")
public class sysUserServiceImpl implements sysUserService {

    @Autowired
    private sysUserHandle sysuserhandle;

    @Override
    public sysUser selectByid(String id) {
        return sysuserhandle.selectByid(id);
    }

    @Override
    public sysUser selectByUsername(String username) {
        return sysuserhandle.selectByUsername(username);
    }

    @Override
    public List<Map<String, String>> selectUserByOrgid(String orgid,Integer pageNo,Integer pageSize,String orderSort,String orderFiled) {
        PageHelper.startPage(pageNo, pageSize);
        List<Map<String, String>> userall= sysuserhandle.selectUserByOrgid(orgid,orderSort,orderFiled);
        PageInfo<Map<String, String>> pageInfo =new PageInfo(userall);
        List<Map<String, String>> users=pageInfo.getList();
        return users;
    }


}
