package com.goku.handler.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.SysModuleHandle;
import com.goku.mapper.ext.SysModuleExtMapper;
import com.goku.model.SysModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by nbfujx on 2018/2/11.
 */@Component
public class SysModuleHandleImpl implements SysModuleHandle {

    @Autowired
    SysModuleExtMapper sysmoduleextmapper;

    @Override
    public SysModule selectByid(String id) {
        return sysmoduleextmapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo getModuleForPaging() {
        PageHelper.startPage(1, Integer.MAX_VALUE);
        List<SysModule> list = sysmoduleextmapper.getModuleForPaging();
        PageInfo page = new PageInfo(list);
        return page;
    }
}
