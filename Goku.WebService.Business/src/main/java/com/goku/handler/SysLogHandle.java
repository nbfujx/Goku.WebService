package com.goku.handler;

import com.github.pagehelper.PageInfo;

import java.util.Date;

/**
 * Created by nbfujx on 2018-02-09.
 */
public interface SysLogHandle {
    PageInfo getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum);
}
