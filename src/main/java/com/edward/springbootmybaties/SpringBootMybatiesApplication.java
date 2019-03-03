package com.edward.springbootmybaties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.edward.sprignbootmybaties")
@SpringBootApplication
public class SpringBootMybatiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatiesApplication.class, args);
    }

}
