package com.goku.webapi.handler;

import com.goku.model.sysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
public interface sysUserHandler {
    List<Map<String, String>> selectUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled);
    sysUser selectByid(String id);
}
