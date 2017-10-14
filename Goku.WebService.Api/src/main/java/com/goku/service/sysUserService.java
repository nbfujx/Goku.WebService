package com.goku.service;

import com.goku.model.sysUser;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserService {
    sysUser selectByUsername(String username);

    sysUser selectByid(String id);
}
