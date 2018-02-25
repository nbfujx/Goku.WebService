package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goku.handler.LoginHandle;
import com.goku.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nbfujx on 2017/10/15.
 */
@Service(version = "1.0.0")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginHandle loginhandle;


}
