package com.example.springcore.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.example.springcore")
@PropertySource("classpath:application.properties")
@PropertySource(value = "classpath:application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
public class AppConfig {

    // Necessário para resolver @Value
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    @Profile("dev")
    public String ambienteDev() {
        return "Desenvolvimento";
    }

    @Bean
    @Profile("prod")
    public String ambienteProd() {
        return "Produção";
    }
}
