package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("husky test1");
        System.out.println("husky test2");
        System.out.println("husky test3");
        System.out.println("semantic release test1");
        System.out.println("semantic release test2");
        System.out.println("semantic release test3");
        System.out.println("semantic release test4");
        System.out.println("semantic release test5");
        System.out.println("semantic release test6");

        System.out.println("semantic release test7");
        System.out.println("semantic release test8");
        System.out.println("semantic release test9");
        System.out.println("semantic release test10");
      
        SpringApplication.run(DemoApplication.class, args);

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] beanNamesForType = ac.getBeanNamesForType(Object.class);

        for (String s : beanNamesForType) {
            System.out.println("name: " + s + " bean: " + ac.getBean(s));
        }

        List<String> list = new ArrayList<>();
        list.add("yang");
        list.add("jung");
        list.add("jang");

        List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integer : collect) {
            System.out.println(integer);
        }

    }

}
