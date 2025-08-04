package com.example.springcore;

import com.example.springcore.config.AppConfig;
import com.example.springcore.service.MessageService;
import com.example.springcore.service.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService message = context.getBean(MessageService.class);
        System.out.print(message.getMessage());
    }
}