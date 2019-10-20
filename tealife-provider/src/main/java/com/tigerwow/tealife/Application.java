package com.tigerwow.tealife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * create by vvh 2019/10/18 下午1:16
 */
@SpringBootApplication
@ImportResource("classpath:dubbo/*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
