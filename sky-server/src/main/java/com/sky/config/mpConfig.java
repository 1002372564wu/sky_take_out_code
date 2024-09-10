package com.sky.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mpConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //定义分页查询拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        //添加拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());

        return interceptor;
    }
}
