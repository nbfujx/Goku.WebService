package com.goku.service;

import com.goku.model.SysUser;

import java.util.List;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface SysUserService {
    SysUser selectByUsername(String username);
    SysUser selectByid(String id);
    List<SysUser> selectUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled);
}
