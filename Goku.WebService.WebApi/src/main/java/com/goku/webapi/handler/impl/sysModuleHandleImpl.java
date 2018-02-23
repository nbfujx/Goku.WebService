package com.goku.webapi.handler.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.goku.common.model.TablePage;
import com.goku.common.util.PageUtil;
import com.goku.service.SysModuleService;
import com.goku.webapi.handler.SysModuleHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2018/2/11.
 */
@Component
public class SysModuleHandleImpl implements SysModuleHandle {

    @Reference(version = "1.0.0")
    SysModuleService sysmoduleservice;

    @Autowired
    PageUtil pageutil;

    @Override
    public String selectByid(String id) {
        return JSON.toJSONString (sysmoduleservice.selectByid(id));
    }

    @Override
    public String getModuleForPaging() {
        PageInfo page = sysmoduleservice.getModuleForPaging();
        TablePage tp= pageutil.getDataForPaging(page);
        return JSON.toJSONString (tp);
    }
}
