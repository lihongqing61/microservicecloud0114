package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.springcloud.dao")
public class ProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001Application.class, args);
    }
}
