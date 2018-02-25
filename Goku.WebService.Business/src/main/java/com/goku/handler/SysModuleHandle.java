package com.goku.handler;

import com.github.pagehelper.PageInfo;
import com.goku.model.SysModule;

/**
 * Created by nbfujx on 2018/2/11.
 */
public interface SysModuleHandle {
    SysModule selectByid(String id);
    PageInfo getModuleForPaging();
}
