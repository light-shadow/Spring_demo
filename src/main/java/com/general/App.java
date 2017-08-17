package com.general;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by general on 2017/8/13.
 */

/*
第一种方法：继承来自WebMvcConfigurerAdapter，重写configureMessageConverters方法实现自己使用fastjson
 */
//@SpringBootApplication
//public class App extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//
//    // 1.需要先定一个一个convert消息转换对象
//    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//    // 2.添加fastJson的配置, 比如是否要格式化返回json数据
//    FastJsonConfig fastJsonConfig = new FastJsonConfig();
//    fastJsonConfig.setSerializerFeatures(
//            SerializerFeature.PrettyFormat
//    );
//    // 3.在convert中添加配置信息
//    fastConverter.setFastJsonConfig(fastJsonConfig);
//    // 4.将convert添加到converts中
//    converters.add(fastConverter);
//    }
//
//    public static void main(String [] args)
//    {
//        SpringApplication.run(App.class, args);
//    }
//
//}

/*
第二种方法：注入bean
 */

@SpringBootApplication
public class App
{
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        // 1.需要先定一个一个convert消息转换对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 2.添加fastJson的配置, 比如是否要格式化返回json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        // 3.在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        // 4.实例化一个convert对象
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }

    public static void main(String [] args)
    {
        SpringApplication.run(App.class, args);
    }
}

