package test.com.goku.service.impl;


import com.goku.ProviderApplication;
import com.goku.handler.SysUserHandle;
import com.goku.mapper.ext.SysUserExtMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class sysUserServiceImplTest  {

    @Autowired
    private SysUserHandle sysuserhandle;

    @Autowired
    private SysUserExtMapper sysuserextmapper;

    @Test
    public void selectUserByOrgid() {
        sysuserextmapper.selectByUsername("nbfujx");
    }
} 

