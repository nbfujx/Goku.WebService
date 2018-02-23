package com.goku.webapi.controller.impl;

import com.goku.common.util.DateUtil;
import com.goku.webapi.controller.SysLogController;
import com.goku.webapi.handler.SysLogHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by nbfujx on 2018/1/16.
 */
@RestController
@RequestMapping("sysLog")
public class SysLogControllerImpl implements SysLogController {

    @Autowired
    SysLogHandle sysloghandle;

    @Override
    @RequestMapping("/getLogForPaging")
    public String  getLogForPaging(@RequestParam(required=false) String username,
                                    @RequestParam(required=false)  String begindate,
                                    @RequestParam(required=false) String  enddate,
                                    @RequestParam int pageNumber, @RequestParam int pageSize){

        String str=sysloghandle.getLogForPaging(username, DateUtil.StrtoDate(begindate,"yyyy-MM-dd"), DateUtil.StrtoDate(enddate,"yyyy-MM-dd"),pageNumber,pageSize);
        return str;
    }

}
