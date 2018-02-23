package com.goku.handler.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.SysLogHandle;
import com.goku.mapper.ext.SysLogExtMapper;
import com.goku.model.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.List;

/**
 * Created by nbfujx on 2018-02-09.
 */
@Component
public class SysLogHandleImpl implements SysLogHandle {

    @Autowired
    SysLogExtMapper syslogextmapper;

    @Override
    public PageInfo getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum) {
        PageHelper.startPage(pageindex, pagenum);
        List<SysLog> list = syslogextmapper.getLogForPaging(username, begindate,enddate);
        PageInfo page = new PageInfo(list);
        return page;
    }
}
