package com.goku.service;

import com.goku.model.SysMenu;

import java.util.List;

/**
 * Created by nbfujx on 2018/2/23.
 */
public interface SysMenuService {
    List<SysMenu> getModuleMenuForTree(String moduleId);
}
