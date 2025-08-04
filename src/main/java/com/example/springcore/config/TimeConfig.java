package com.example.springcore.config;

import com.example.springcore.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeConfig {

    @Bean
    public TimeService timeService() {
        return new TimeService();
    }
}
