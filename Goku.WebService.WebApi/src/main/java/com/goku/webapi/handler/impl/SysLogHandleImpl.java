package com.goku.webapi.handler.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.goku.common.model.TablePage;
import com.goku.common.util.PageUtil;
import com.goku.service.SysLogService;
import com.goku.webapi.handler.SysLogHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by nbfujx on 2018-02-09.
 */
@Component
public class SysLogHandleImpl implements SysLogHandle {

    @Reference(version = "1.0.0")
    SysLogService syslogservice;

    @Autowired
    PageUtil pageutil;

    @Override
    public String getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum) {
        PageInfo page = syslogservice.getLogForPaging(username,begindate,enddate,pageindex,pagenum);
        TablePage tp= pageutil.getDataForPaging(page);
        return JSON.toJSONString (tp);
    }
}
