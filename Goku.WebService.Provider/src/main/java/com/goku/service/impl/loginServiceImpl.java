package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goku.handle.loginHandle;
import com.goku.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
@Service
public class loginServiceImpl implements loginService {

    @Autowired
    private loginHandle loginhandle;

    @Override
    public boolean validUser(String username, String password, String orgid) {
        return loginhandle.validUser(username,password,orgid);
    }


}
