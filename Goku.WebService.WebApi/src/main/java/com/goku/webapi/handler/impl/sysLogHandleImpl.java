package com.goku.webapi.handler.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.common.model.tablePage;
import com.goku.common.util.pageUtil;
import com.goku.model.sysLog;
import com.goku.service.sysLogService;
import com.goku.webapi.handler.sysLogHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by nbfujx on 2018-02-09.
 */
@Component
public class sysLogHandleImpl implements sysLogHandle {

    @Reference(version = "1.0.0")
    sysLogService syslogservice;

    @Autowired
    pageUtil pageutil;

    @Override
    public String getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum) {
        PageInfo page = syslogservice.getLogForPaging(username,begindate,enddate,pageindex,pagenum);
        tablePage tp= pageutil.getDataForPaging(page);
        return JSON.toJSONString (tp);
    }
}
