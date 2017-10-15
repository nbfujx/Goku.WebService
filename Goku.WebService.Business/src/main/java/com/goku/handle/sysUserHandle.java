package com.goku.handle;

import com.goku.model.sysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserHandle {
    sysUser selectByUsername(String username);
    sysUser selectByid(String id);
    List<Map<String, String>> selectUserByOrgid(String orgid,String orderSort,String orderFiled);
    Map<String, String> selectUserByUsername( String username);
}
