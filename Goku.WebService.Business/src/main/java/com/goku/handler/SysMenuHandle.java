package com.goku.handler;

import com.goku.model.SysMenu;

import java.util.List;

/**
 * Created by nbfujx on 2018/2/23.
 */
public interface SysMenuHandle {
    List<SysMenu> getModuleMenuForTree(String moduleId);
}
