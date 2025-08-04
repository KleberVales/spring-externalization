package com.example.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public String ambienteDev() {
        System.out.println("🔧 Bean do perfil DEV foi carregado.");
        return "Ambiente de Desenvolvimento";
    }

    @Bean
    @Profile("prod")
    public String ambienteProd() {
        System.out.println("🚀 Bean do perfil PROD foi carregado.");
        return "Ambiente de Produção";
    }
}
