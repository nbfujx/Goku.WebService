package com.goku.handler.impl;

import com.goku.handler.LoginHandle;
import com.goku.mapper.ext.SysUserExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2017/10/14.
 */
@Component
public class LoginHandleImpl implements LoginHandle {

    @Autowired
    private SysUserExtMapper sysuserextmapper;


}
