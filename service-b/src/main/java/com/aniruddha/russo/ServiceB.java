package com.aniruddha.russo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServiceB extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServiceB.class, args);
    }
}
