package test.com.goku.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goku.ProviderApplication;
import com.goku.handler.sysUserHandle;
import com.goku.mapper.ext.sysUserExtMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class sysUserServiceImplTest  {

    @Autowired
    private sysUserHandle sysuserhandle;

    @Autowired
    private sysUserExtMapper sysuserextmapper;

    @Test
    public void selectUserByOrgid() {
        sysuserextmapper.selectByUsername("nbfujx");
    }
} 

