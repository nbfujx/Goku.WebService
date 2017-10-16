package com.goku.webapi.controller.impl;

import com.goku.webapi.controller.sysUserController;
import com.goku.webapi.handler.sysUserHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
@RestController
@RequestMapping("sysUser")
@Api(value="sysUser")
public class sysUserControllerImpl implements sysUserController {

    @Autowired
    sysUserHandler sysuserHandler;

    @Override
    @RequestMapping(value="getUserPassword", method = RequestMethod.GET)
    @ApiOperation(value = "获取用户名,密码", httpMethod = "GET", response = sysUserController.class, notes = "获取用户名,密码")
    public List<Map<String, String>> getUserPassword(){//(@PathVariable String orgid, @PathVariable Integer pageNo, @PathVariable Integer pageSize,
                                                       //@PathVariable String orderSort, @PathVariable String orderFiled) {
        return   sysuserHandler.selectUserByOrgid("1",1,10,"desc","id");//sysuserHandler.selectUserByOrgid(orgid,pageNo,pageSize,orderSort,orderFiled);
    }
}
