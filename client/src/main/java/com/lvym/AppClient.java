package com.lvym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@ServletComponentScan//拦截器filter起作用
public class AppClient {
    public static void main(String[] args) {
        SpringApplication.run(AppClient.class,args);
    }
}
