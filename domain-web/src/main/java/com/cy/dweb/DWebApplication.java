package com.cy.dweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DWebApplication.class, args);
    }
}
