package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.sysModuleHandle;
import com.goku.model.sysModule;
import com.goku.service.sysModuleService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by nbfujx on 2018/1/1.
 */
@Service(version = "1.0.0")
public class sysModuleServiceImpl implements sysModuleService {

    @Autowired
    sysModuleHandle sysmodulehandle;

    @Override
    public sysModule selectByid(String id) {
        return sysmodulehandle.selectByid(id);
    }

    @Override
    public PageInfo getModuleForPaging() {
        return sysmodulehandle.getModuleForPaging();
    }
}
