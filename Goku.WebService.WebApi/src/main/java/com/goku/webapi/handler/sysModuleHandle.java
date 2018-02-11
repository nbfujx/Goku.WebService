package com.goku.webapi.handler;

import com.github.pagehelper.PageInfo;
import com.goku.model.sysModule;

/**
 * Created by nbfujx on 2018/2/11.
 */
public interface sysModuleHandle {
    String selectByid(String id);
    String getModuleForPaging();
}
