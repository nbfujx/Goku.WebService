package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.goku.handler.SysLogHandle;
import com.goku.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by nbfujx on 2018/1/16.
 */
@Service(version = "1.0.0")
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    SysLogHandle SysLogHandle;

    @Override
    public PageInfo getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum) {
        return SysLogHandle.getLogForPaging(username, begindate,enddate,pageindex,pagenum);
    }
}
