package com.goku.handle.impl;

import com.goku.mapper.sysUserMapper;
import com.goku.model.sysUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by nbfujx on 2017/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring-mybatis.xml")
public class sysUserHandleImplTest extends sysUserHandleImpl {

    @Test
    public void selectByid() throws Exception {
        sysUser user= selectByid("1");
        System.out.println(user.getId());
    }

    @Test
    public void selectByUsername() throws Exception {
        sysUser user= selectByUsername("1");
        System.out.println(user.getId());
    }

}