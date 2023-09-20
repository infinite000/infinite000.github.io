package com.soft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: soft863
 * @Description:
 * @Date: Create in 23:49 2021/8/9
 */
@MapperScan("com.soft.mapper")
@SpringBootApplication
public class EyesApplication {
    public static void main(String[] args) {
        SpringApplication.run(EyesApplication.class,args);
    }
}
