package com.goku.handler;

import com.github.pagehelper.PageInfo;
import com.goku.model.sysModule;

/**
 * Created by nbfujx on 2018/2/11.
 */
public interface sysModuleHandle {
    sysModule selectByid(String id);
    PageInfo getModuleForPaging();
}
