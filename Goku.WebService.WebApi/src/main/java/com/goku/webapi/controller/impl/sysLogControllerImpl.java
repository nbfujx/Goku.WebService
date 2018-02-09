package com.goku.webapi.controller.impl;

import com.alibaba.fastjson.JSON;
import com.goku.common.util.dateUtil;
import com.goku.webapi.controller.sysLogController;
import com.goku.webapi.handler.sysLogHandle;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by nbfujx on 2018/1/16.
 */
@RestController
@RequestMapping("sysLog")
public class sysLogControllerImpl implements sysLogController {

    @Autowired
    sysLogHandle sysloghandle;

    @Override
    @RequestMapping("/getLogForPaging")
    public String  getLogForPaging(@RequestParam(required=false) String username,
                                    @RequestParam(required=false)  String begindate,
                                    @RequestParam(required=false) String  enddate,
                                    @RequestParam int pageNumber, @RequestParam int pageSize){

        String str=sysloghandle.getLogForPaging(username, dateUtil.StrtoDate(begindate,"yyyy-MM-dd"),dateUtil.StrtoDate(enddate,"yyyy-MM-dd"),pageNumber,pageSize);
        return str;
    }

}
