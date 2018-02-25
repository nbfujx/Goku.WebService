package com.goku.webapi.handler;

import com.goku.model.SysUser;

import java.util.List;

/**
 * Created by nbfujx on 2017/10/15.
 */
public interface SysUserHandler {
    List<SysUser> selectUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled);
    SysUser selectByid(String id);
}
