package com.spring.microservices.demo.webfunctiondeploymnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class WebFunctionDeploymnetApplication {

    public static void main (String[] args) {
        SpringApplication.run (WebFunctionDeploymnetApplication.class, args);
    }

    @Bean
    public Function<String, String> function () {
        return value -> "Return value is: " + value;
    }
}
