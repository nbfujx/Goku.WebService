package com.goku.webapi.controller.impl;

import com.alibaba.fastjson.JSON;
import com.goku.webapi.controller.SysUserController;
import com.goku.webapi.handler.SysUserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2017/10/15.
 */
@RestController
@RequestMapping("sysUser")
public class SysUserControllerImpl implements SysUserController {

    @Autowired
    SysUserHandler sysuserHandler;

    @Override
    @RequestMapping(value="getUserList", method = RequestMethod.GET)
    public String getUserByOrgid(@PathVariable String orgid, @PathVariable Integer pageNo, @PathVariable Integer pageSize,
                                                       @PathVariable String orderSort, @PathVariable String orderFiled) {
        return   JSON.toJSONString (sysuserHandler.selectUserByOrgid(orgid,pageNo,pageSize,orderSort,orderFiled));
    }

    @Override
    @RequestMapping(value="getUser/{id}", method = RequestMethod.GET)
    public String  getUserByid(@PathVariable String id) {
        return   JSON.toJSONString (sysuserHandler.selectByid(id));
    }
}
