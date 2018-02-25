package com.goku.handler.impl;

import com.goku.handler.SysMenuHandle;
import com.goku.mapper.ext.SysMenuExtMapper;
import com.goku.model.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by nbfujx on 2018/2/23.
 */
@Component
public class SysMenuHandleImpl implements SysMenuHandle {

    @Autowired
    SysMenuExtMapper sysMenuExtMapper;

    @Override
    public List<SysMenu> getModuleMenuForTree(String moduleId) {
        return sysMenuExtMapper.getModuleMenuForTree(moduleId);
    }
}
