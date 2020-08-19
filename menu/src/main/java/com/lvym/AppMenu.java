package com.lvym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lvym.repository")
public class AppMenu {
    public static void main(String[] args) {
        SpringApplication.run(AppMenu.class,args);
    }
}

