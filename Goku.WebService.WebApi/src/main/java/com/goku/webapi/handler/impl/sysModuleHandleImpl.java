package com.goku.webapi.handler.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.common.model.tablePage;
import com.goku.common.util.pageUtil;
import com.goku.model.sysModule;
import com.goku.service.sysModuleService;
import com.goku.webapi.handler.sysModuleHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by nbfujx on 2018/2/11.
 */
@Component
public class sysModuleHandleImpl implements sysModuleHandle {

    @Reference(version = "1.0.0")
    sysModuleService sysmoduleservice;

    @Autowired
    pageUtil pageutil;

    @Override
    public String selectByid(String id) {
        return JSON.toJSONString (sysmoduleservice.selectByid(id));
    }

    @Override
    public String getModuleForPaging() {
        PageInfo page = sysmoduleservice.getModuleForPaging();
        tablePage tp= pageutil.getDataForPaging(page);
        return JSON.toJSONString (tp);
    }
}
