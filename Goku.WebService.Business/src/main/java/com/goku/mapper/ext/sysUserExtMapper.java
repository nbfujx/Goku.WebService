package com.goku.mapper.ext;

import com.goku.model.sysUser;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserExtMapper {
    /**
    *@param  username 用户名
    */
    sysUser selectByUsername(String username);

}
