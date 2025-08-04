package com.example.springcore;

import com.example.springcore.properties.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        // Inicia o contexto Spring Boot
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

        // Acessa as propriedades definidas via @Value
        AppProperties props = context.getBean(AppProperties.class);
        props.print();

        // Demonstra qual perfil está ativo (dev ou prod)
        String ambiente = context.getBean(String.class);
        System.out.println("🔍 Perfil ativo: " + ambiente);
    }
}
