package com.goku.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.handler.sysLogHandle;
import com.goku.service.sysLogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by nbfujx on 2018/1/16.
 */
@Service(version = "1.0.0")
public class sysLogServiceImpl implements sysLogService {

    @Autowired
    sysLogHandle sysLogHandle;

    @Override
    public PageInfo getLogForPaging(String username, Date begindate, Date enddate, int pageindex, int pagenum) {
        return sysLogHandle.getLogForPaging(username, begindate,enddate,pageindex,pagenum);
    }
}
