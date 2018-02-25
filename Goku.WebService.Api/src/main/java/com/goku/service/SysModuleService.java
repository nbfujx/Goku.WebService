package com.goku.service;

import com.github.pagehelper.PageInfo;
import com.goku.model.SysModule;

/**
 * Created by nbfujx on 2018/1/1.
 */
public interface SysModuleService {
    SysModule selectByid(String id);
    PageInfo getModuleForPaging();
}
