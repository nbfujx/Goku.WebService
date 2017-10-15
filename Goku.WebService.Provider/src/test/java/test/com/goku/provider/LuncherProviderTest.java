package test.com.goku.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nbfujx on 2017/10/14.
 */
public class LuncherProviderTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/spring-context.xml"});
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }
}
