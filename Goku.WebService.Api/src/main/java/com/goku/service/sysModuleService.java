package com.goku.service;

import com.github.pagehelper.PageInfo;
import com.goku.model.sysModule;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nbfujx on 2018/1/1.
 */
public interface sysModuleService {
    sysModule selectByid(String id);
    PageInfo getModuleForPaging();
}
