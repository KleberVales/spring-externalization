package com.example.springcore.config;

import com.example.springcore.service.MessageService;
import com.example.springcore.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService(){
        return new MessageService(new TimeService());
    }
}
