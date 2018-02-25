package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.goku.handler.SysModuleHandle;
import com.goku.model.SysModule;
import com.goku.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nbfujx on 2018/1/1.
 */
@Service(version = "1.0.0")
public class SysModuleServiceImpl implements SysModuleService {

    @Autowired
    SysModuleHandle sysmodulehandle;

    @Override
    public SysModule selectByid(String id) {
        return sysmodulehandle.selectByid(id);
    }

    @Override
    public PageInfo getModuleForPaging() {
        return sysmodulehandle.getModuleForPaging();
    }
}
