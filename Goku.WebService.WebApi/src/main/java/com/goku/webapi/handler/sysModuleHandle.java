package com.goku.webapi.handler;

/**
 * Created by nbfujx on 2018/2/11.
 */
public interface SysModuleHandle {
    String selectByid(String id);
    String getModuleForPaging();
}
