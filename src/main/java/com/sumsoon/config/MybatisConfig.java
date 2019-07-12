package com.sumsoon.config;

import org.springframework.context.annotation.Configuration;

/**
 * 如果使用原生的PageHelper,需要手动@Bean设置pageHelper的属性
 * 如果使用stater和springBoot整合,就在properties维护属性
 *
 * Created By Chr on 2019/7/12.
 */
@Configuration
public class MybatisConfig {

//    @Autowired
//    PageHelper pageHelper;

//    @Bean
//    public PageHelper pageHelper() {
//        PageHelper pageHelper = new PageHelper();
//        Properties p = new Properties();
//        p.setProperty("dialect", "Mysql");
//        p.setProperty("offsetAsPageNum", "true");
//        p.setProperty("rowBoundsWithCount", "true");
//        pageHelper.setProperties(p);
//        return pageHelper;
//    }

}
