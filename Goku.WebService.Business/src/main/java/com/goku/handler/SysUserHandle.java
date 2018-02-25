package com.goku.handler;

import com.goku.model.SysUser;

import java.util.List;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface SysUserHandle {
    SysUser selectByid(String id);
    SysUser selectByUsername(String username);
    List<SysUser> selectUserByOrgid(String orgid, String orderSort, String orderFiled);
}
