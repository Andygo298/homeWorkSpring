package com.github.andygo298.homeWorkSpring.workDirectory.Task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task2JavaConfig {

    @Bean
    public UserJavaCfg userJavaCfg() {
        return new UserJavaCfg();
    }

}
