package com.goku.webapi.handler;

import com.github.pagehelper.PageInfo;

import java.util.Date;

/**
 * Created by nbfujx on 2018-02-09.
 */
public interface SysLogHandle {
    String getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum);
}
