package test.com.goku.service.impl;


import com.goku.service.impl.loginServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by nbfujx on 2017/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/spring-context.xml")
public class loginServiceImplTest extends loginServiceImpl {

    @Test
    public void validUser() throws Exception {
        boolean flag=validUser("1","1","1");
        System.out.println(flag);
    }

}