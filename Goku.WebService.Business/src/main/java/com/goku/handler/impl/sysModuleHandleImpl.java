package com.goku.handler.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.sysModuleHandle;
import com.goku.mapper.ext.sysModuleExtMapper;
import com.goku.model.sysModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by nbfujx on 2018/2/11.
 */@Component
public class sysModuleHandleImpl  implements sysModuleHandle {

    @Autowired
    sysModuleExtMapper sysmoduleextmapper;

    @Override
    public sysModule selectByid(String id) {
        return sysmoduleextmapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo getModuleForPaging() {
        PageHelper.startPage(1, Integer.MAX_VALUE);
        List<sysModule> list = sysmoduleextmapper.getModuleForPaging();
        PageInfo page = new PageInfo(list);
        return page;
    }
}
