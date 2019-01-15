package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.springcloud.dao")
@EnableEurekaClient             //本服务启动后会自动注册进eureka服务中
public class ProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001Application.class, args);
    }
}
