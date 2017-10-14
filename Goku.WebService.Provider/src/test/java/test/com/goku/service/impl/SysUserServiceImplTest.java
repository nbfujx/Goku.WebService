package test.com.goku.service.impl;

import com.goku.model.sysUser;
import com.goku.service.impl.SysUserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nbfujx on 2017/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/spring-context.xml")
public class SysUserServiceImplTest extends SysUserServiceImpl {

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