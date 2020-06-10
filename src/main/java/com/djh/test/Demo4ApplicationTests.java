package com.djh.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@ComponentScan(basePackages = {"com.djh"})
 public class Demo4ApplicationTests {

    public static void main(String[] args) {
            SpringApplication.run(Demo4ApplicationTests.class, args);
    }

}
