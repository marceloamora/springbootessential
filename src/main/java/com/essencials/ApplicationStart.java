package com.essencials;


import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class ApplicationStart {
    public static void main(String[] args ){
        SpringApplication.run(ApplicationStart.class, args);

    }
}
