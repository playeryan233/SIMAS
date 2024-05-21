package com.simas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simas.mapper")
public class SIMASApplication {

    public static void main(String[] args) {
        SpringApplication.run(SIMASApplication.class, args);
    }
}
