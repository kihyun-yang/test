package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("husky test1");
        System.out.println("husky test2");
        System.out.println("husky test3");
        SpringApplication.run(DemoApplication.class, args);
    }

}
