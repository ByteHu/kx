package com.hu.kx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KxConfigBean.class)
public class KxApplication {

    public static void main(String[] args) {
        SpringApplication.run(KxApplication.class, args);
    }

}
