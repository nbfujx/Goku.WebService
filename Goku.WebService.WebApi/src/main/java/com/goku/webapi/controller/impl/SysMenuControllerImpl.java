package com.goku.webapi.controller.impl;

import com.goku.webapi.controller.SysMenuController;
import com.goku.webapi.handler.SysMenuHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2018/2/24.
 */
@RestController
@RequestMapping("sysMenu")
public class SysMenuControllerImpl implements SysMenuController {

    @Autowired
    SysMenuHandle sysMenuHandle;

    @Override
    @RequestMapping("/getMenuForTree")
    public String  getMenuForTree(@RequestParam(value="moduleId", required=false, defaultValue="") String moduleId){
        return sysMenuHandle.getModuleMenuForTree(moduleId);
    }
}
