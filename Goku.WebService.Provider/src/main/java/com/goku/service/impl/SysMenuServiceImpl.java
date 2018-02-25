package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goku.handler.SysMenuHandle;
import com.goku.model.SysMenu;
import com.goku.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nbfujx on 2018/2/23.
 */
@Service(version = "1.0.0")
public class SysMenuServiceImpl implements SysMenuService {


    @Autowired
    SysMenuHandle sysMenuHandle;

    @Override
    public List<SysMenu> getModuleMenuForTree(String moduleId) {
        return sysMenuHandle.getModuleMenuForTree(moduleId);
    }
}
