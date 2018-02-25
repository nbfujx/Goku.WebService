package com.goku.webapi.controller;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by nbfujx on 2018/2/24.
 */
public interface SysMenuController {
    String  getMenuForTree(String moduleId);
}
