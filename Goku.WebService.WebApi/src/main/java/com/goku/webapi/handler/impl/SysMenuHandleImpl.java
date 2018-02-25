package com.goku.webapi.handler.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.goku.model.SysMenu;
import com.goku.service.SysMenuService;
import com.goku.webapi.handler.SysMenuHandle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nbfujx on 2018/2/23.
 */
@Component
public class SysMenuHandleImpl implements SysMenuHandle {

    @Reference(version = "1.0.0")
    SysMenuService sysMenuService;

    @Override
    public String getModuleMenuForTree(String moduleId) {
        List<SysMenu> sysmenus= sysMenuService.getModuleMenuForTree(moduleId);
        List<SysMenu> sysmenutree=MenuToMenuTree(sysmenus);
        return JSON.toJSONString (sysmenutree);
    }

    public  List<SysMenu> MenuToMenuTree(List<SysMenu> menu){
        List<SysMenu> list = new ArrayList<>();
        for (SysMenu x : menu) {
            SysMenu sysMenu = new SysMenu();
            if("-1".equals(x.getParentId())){
                sysMenu.setId(x.getId());
                sysMenu.setModuleId(x.getModuleId());
                sysMenu.setName(x.getName());
                sysMenu.setLabel(x.getName());
                sysMenu.setParentId(x.getParentId());
                sysMenu.setIsparent(x.getIsparent());
                sysMenu.setSort(x.getSort());
                sysMenu.setIcon(x.getIcon());
                sysMenu.setDescription(x.getDescription());
                sysMenu.setIfShow(x.getIfShow());
                sysMenu.setIsLeaf(x.getIsLeaf());
                sysMenu.setPermission(x.getPermission());
                sysMenu.setUrl(x.getUrl());
                sysMenu.setChildren(menuChild(menu,x.getId()));
                list.add(sysMenu);
            }
        }
        return list;
    }

    public  List<SysMenu> menuChild(List<SysMenu> menu,String id){
        List<SysMenu> lists = new ArrayList<SysMenu>();
        for(SysMenu x:menu){
            SysMenu sysMenu = new SysMenu();
            if(id.equals(x.getParentId())){
                sysMenu.setId(x.getId());
                sysMenu.setModuleId(x.getModuleId());
                sysMenu.setName(x.getName());
                sysMenu.setLabel(x.getName());
                sysMenu.setParentId(x.getParentId());
                sysMenu.setIsparent(x.getIsparent());
                sysMenu.setSort(x.getSort());
                sysMenu.setIcon(x.getIcon());
                sysMenu.setDescription(x.getDescription());
                sysMenu.setIfShow(x.getIfShow());
                sysMenu.setIsLeaf(x.getIsLeaf());
                sysMenu.setPermission(x.getPermission());
                sysMenu.setUrl(x.getUrl());
                sysMenu.setChildren(menuChild(menu,x.getId()));
                lists.add(sysMenu);
            }
        }
        return lists;

    }


}
