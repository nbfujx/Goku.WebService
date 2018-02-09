package com.goku.webapi.controller;


/**
 * Created by nbfujx on 2018/1/16.
 */
public interface sysLogController {
    String  getLogForPaging(String username, String begindate, String enddate, int pageNumber, int pageSize);
}
