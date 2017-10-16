package com.goku.webapi.config;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by nbfujx on 2017/10/16.
 */

@Configuration
@EnableWebMvc//如果没加这个会报错
@EnableSwagger//上面三个注释都是必要的，无添加便会出现莫名奇妙的错误
@ComponentScan(basePackages="com.goku.webapi.controller")//添加这个注释，会自动扫描该类中的每一个方法自动生成api文档
public class SwaggerConfig {

    private SpringSwaggerConfig springSwaggerConfig;

    /**
     * Required to autowire SpringSwaggerConfig
     */
    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig)
    {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    /**
     * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc
     * framework - allowing for multiple swagger groups i.e. same code base
     * multiple swagger resource listings.
     */
    @Bean
    public SwaggerSpringMvcPlugin customImplementation()
    {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(apiInfo())
                .includePatterns(".*?");
    }

    private ApiInfo apiInfo()
    {
        ApiInfo apiInfo = new ApiInfo(
                "Goku.WebService.Webapi Title",
                "Goku.WebService.Webapi Description",
                "Goku.WebService.Webapi terms of service",
                "Goku.WebService.Webapi Contact Email",
                "Goku.WebService.Webapi Licence Type",
                "Goku.WebService.Webapi icense URL");
        return apiInfo;
    }
}