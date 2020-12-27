package com.ch2.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = CD.class)
public class CDPlayerConfig {

    @Bean
    public CD play() {
        return new Play();
    }
}
