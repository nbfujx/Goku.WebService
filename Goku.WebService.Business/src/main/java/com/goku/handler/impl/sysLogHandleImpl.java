package com.goku.handler.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.sysLogHandle;
import com.goku.mapper.ext.sysLogExtMapper;
import com.goku.model.sysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.List;

/**
 * Created by nbfujx on 2018-02-09.
 */
@Component
public class sysLogHandleImpl implements sysLogHandle {

    @Autowired
    sysLogExtMapper syslogextmapper;

    @Override
    public PageInfo getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum) {
        PageHelper.startPage(pageindex, pagenum);
        List<sysLog> list = syslogextmapper.getLogForPaging(username, begindate,enddate);
        PageInfo page = new PageInfo(list);
        return page;
    }
}
