package com.lvym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppErureka {
    public static void main(String[] args) {
        SpringApplication.run(AppErureka.class,args);
    }
}
