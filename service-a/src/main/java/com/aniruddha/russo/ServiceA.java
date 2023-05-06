package com.aniruddha.russo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServiceA extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServiceA.class, args);
    }
}