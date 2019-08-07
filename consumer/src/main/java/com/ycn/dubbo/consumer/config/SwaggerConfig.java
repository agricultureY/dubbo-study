package com.ycn.dubbo.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @desc:
 * @author: ycn
 * @date: 2019/8/1 11:02
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * @desc: 
     * @author: ycn
     * @date: 2019/8/1 11:08
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ycn.dubbo.consumer.rest"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @desc: 
     * @author: ycn
     * @date: 2019/8/1 11:12
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("APIS")
                .description("Spring boot 整合 dubbo")
                .termsOfServiceUrl("cjy")
                .version("1.0.0")
                .build();
    }
}
