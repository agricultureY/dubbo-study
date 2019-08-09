package com.ycn.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @desc: 
 * @author: ycn
 * @date: 2019/8/9 9:23
 */
@EnableDubbo    //开启基于注解的dubbo功能
@SpringBootApplication
@EnableTransactionManagement
//@ImportResource("classpath:dubbo-provider.xml")   //spring配置时需引入资源路径
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
