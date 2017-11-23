package com.goku.handler;

import com.goku.model.sysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserHandle {
    sysUser selectByid(String id);
    sysUser selectByUsername(String username);
    List<Map<String, String>> selectUserByOrgid(String orgid,String orderSort,String orderFiled);
}
