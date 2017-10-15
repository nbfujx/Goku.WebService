package test.com.goku.webapi;

import com.alibaba.dubbo.config.annotation.Reference;
import com.goku.service.loginService;
import com.goku.service.sysUserService;
import com.goku.webapi.handler.sysUserHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class sysUserHandlerTest {


    @Autowired
    sysUserHandler sysuserHandler;


    @Test
    public void selectUserByOrgid() throws Exception {
        List<Map<String, String>> users=  sysuserHandler.selectUserByOrgid("1",1,10,"desc","id");
        for(Map<String, String> item :users) {
            System.out.println("user" + item);
        }

    }

}
