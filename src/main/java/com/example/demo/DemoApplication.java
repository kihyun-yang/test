package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("husky test1");
        System.out.println("husky test2");
        System.out.println("husky test3");

        SpringApplication.run(DemoApplication.class, args);

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] beanNamesForType = ac.getBeanNamesForType(Object.class);

        for (String s : beanNamesForType) {
            System.out.println("name: " + s + " bean: " + ac.getBean(s));
        }

    }

}
